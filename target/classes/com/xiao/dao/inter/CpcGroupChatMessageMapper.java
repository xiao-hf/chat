package com.xiao.dao.inter;

import com.xiao.dao.dto.CpcGroupChatMessage;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CpcGroupChatMessageMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CpcGroupChatMessage record);

    int insertSelective(CpcGroupChatMessage record);

    CpcGroupChatMessage selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CpcGroupChatMessage record);

    List<CpcGroupChatMessage> selectByGroupId(@Param("groupId") Long groupId);

    int updateByPrimaryKey(CpcGroupChatMessage record);

    List<CpcGroupChatMessage> selectAll();
}