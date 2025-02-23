package com.xiao.dao.inter;
import org.apache.ibatis.annotations.Param;

import com.xiao.dao.dto.CpcGroupChatMessage;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CpcGroupChatMessageMapper {
    List<CpcGroupChatMessage> selectByGroupId(@Param("groupId")Long groupId);


    int deleteByPrimaryKey(Long id);

    int insert(CpcGroupChatMessage record);

    int insertSelective(CpcGroupChatMessage record);

    CpcGroupChatMessage selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CpcGroupChatMessage record);

    int updateByPrimaryKey(CpcGroupChatMessage record);

    List<CpcGroupChatMessage> selectAll();
}