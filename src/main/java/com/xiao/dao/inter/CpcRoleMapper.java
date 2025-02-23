package com.xiao.dao.inter;

import com.xiao.dao.dto.CpcRole;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CpcRoleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CpcRole record);

    int insertSelective(CpcRole record);

    CpcRole selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CpcRole record);

    int updateByPrimaryKey(CpcRole record);
}