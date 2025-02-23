package com.xiao.dao.inter;

import com.xiao.dao.dto.CpcGroupRelation;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CpcGroupRelationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CpcGroupRelation record);

    int insertSelective(CpcGroupRelation record);

    CpcGroupRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CpcGroupRelation record);

    int updateByPrimaryKey(CpcGroupRelation record);
}