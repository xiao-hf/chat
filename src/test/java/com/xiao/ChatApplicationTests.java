package com.xiao;

import com.xiao.dao.inter.CpcGroupChatMessageLikeMapper;
import com.xiao.dao.inter.CpcGroupChatMessageMapper;
import com.xiao.dao.inter.CpcMessageMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class ChatApplicationTests {

    @Resource
    CpcMessageMapper mapper;

    @Resource
    CpcGroupChatMessageMapper messageMapper;

    @Resource
    CpcGroupChatMessageLikeMapper likeMapper;

    @Test
    void contextLoads() {
        System.out.println(mapper.selectAll());
        System.out.println(likeMapper.selectAll());
        System.out.println(messageMapper.selectAll());
    }

}
