package com.xiao.service.impl;

import com.xiao.common.R;
import com.xiao.constants.MyConstants;
import com.xiao.dao.dto.CpcUser;
import com.xiao.dao.inter.CpcUserMapper;
import com.xiao.utils.JjwtUtil;
import com.xiao.utils.RedisUtil;
import org.springframework.stereotype.Service;
import com.xiao.service.CpcUserService;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Service
public class CpcUserServiceImpl implements CpcUserService {
    @Resource
    CpcUserMapper userMapper;
    @Resource
    RedisUtil redisUtil;
    @Override
    public R<CpcUser> login(CpcUser user) {
        List<CpcUser> users = userMapper.selectByAll(user);
        if (users.isEmpty())
            return R.fail("用户名或密码错误!");
        else if (users.size() > 1)
            return R.fail("系统错误, 请联系管理员!");
        user = users.get(0);
        String token = JjwtUtil.createJWT(null, null, user, null);
        user.setToken(token);
        userMapper.updateByPrimaryKeySelective(user);
        redisUtil.set(MyConstants.LOGIN_PREFIX + user.getUserName(), "", 30, TimeUnit.MINUTES);
        return R.success("登陆成功!", user);
    }
}
