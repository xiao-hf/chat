package com.xiao.dao.inter;

import com.xiao.dao.dto.CpcGroupChatMessageLike;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CpcGroupChatMessageLikeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CpcGroupChatMessageLike record);

    int insertSelective(CpcGroupChatMessageLike record);

    CpcGroupChatMessageLike selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CpcGroupChatMessageLike record);

    int updateByPrimaryKey(CpcGroupChatMessageLike record);

    List<CpcGroupChatMessageLike> selectAll();
}