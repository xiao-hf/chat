package com.xiao.dao.inter;

import com.xiao.dao.dto.CpcPermission;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CpcPermissionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CpcPermission record);

    int insertSelective(CpcPermission record);

    CpcPermission selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CpcPermission record);

    int updateByPrimaryKey(CpcPermission record);
}