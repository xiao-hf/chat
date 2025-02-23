package com.xiao.socket;

import cn.hutool.json.JSONUtil;
import com.corundumstudio.socketio.SocketIOClient;
import com.corundumstudio.socketio.annotation.OnConnect;
import com.corundumstudio.socketio.annotation.OnDisconnect;
import com.corundumstudio.socketio.annotation.OnEvent;
import com.xiao.common.R;
import com.xiao.constants.MyConstants;
import com.xiao.dao.dto.CpcGroupChatMessage;
import com.xiao.dao.dto.CpcUser;
import com.xiao.dao.inter.CpcGroupChatMessageMapper;
import com.xiao.dao.inter.CpcGroupTableMapper;
import com.xiao.dao.inter.CpcUserMapper;
import com.xiao.utils.JjwtUtil;
import com.xiao.utils.RedisUtil;
import io.jsonwebtoken.Claims;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

@Slf4j
@Component
public class EventListener {
    @Resource
    RedisUtil redisUtil;

    @Resource
    CpcUserMapper userMapper;

    @Resource
    CpcGroupChatMessageMapper chatMessageMapper;

    @Resource
    CpcGroupTableMapper groupMapper;

    @OnConnect
    public void onConnect(SocketIOClient client) {
        UUID sessionId = client.getSessionId();
        ClientCache.saveClient(sessionId, client, new CpcUser());
        redisUtil.set(client.getSessionId().toString(), "", 30, TimeUnit.MINUTES);
        log.info("新连接{}, 连接数:{}", sessionId, ClientCache.getCount());
    }

    @OnDisconnect
    public void onDisconnect(SocketIOClient client) {
        ClientCache.deleteSessionClient(client.getSessionId());
        log.info("{}断开连接, 连接数:{}", client.getSessionId(), ClientCache.getCount());
    }

    @OnEvent("send")
    public R<String> send(SocketIOClient client, HashMap<String, Object> map) {
        String token = (String) map.get("token");
        Long groupId = Long.valueOf(map.get("groupId").toString());
        Claims claims = JjwtUtil.parseJWT(token);
        String username = (String) claims.get("username");
        Long userId = Long.valueOf(claims.get("id").toString());
        String key = MyConstants.LOGIN_PREFIX + username;
        if (!redisUtil.contains(key)) {
            return R.fail("用户已过期!");
        } else {
            redisUtil.expire(key, 30, TimeUnit.MINUTES);
        }
        String data = (String) map.get("data");
        UUID sessionId = client.getSessionId();
        if (ClientCache.getClient(sessionId) == null) {
            log.info("{}已断开连接!", sessionId);
            return R.fail(sessionId + "已断开连接!", null);
        }
        // todo data如果为 file/video/image, 需要存储在minio中, mysql中存url
        redisUtil.expire(sessionId.toString(), 30, TimeUnit.MINUTES);
        log.info("{}往群组{}发送了消息:{}", username, groupId, data);
        CpcGroupChatMessage msg = new CpcGroupChatMessage();
        Date now = new Date();
        msg.setGroupId(groupId);
        msg.setCreateTime(now);
        msg.setUpdateUserId(userId);
        msg.setContentType("文本");
        msg.setContent(data);
        msg.setIsDeleted(false);
        msg.setIsKeyMessage(false);
        msg.setIsPinned(false);
        msg.setPinnedTime(now);
        chatMessageMapper.insert(msg);
        return R.success(JSONUtil.toJsonStr(data));
    }
}
