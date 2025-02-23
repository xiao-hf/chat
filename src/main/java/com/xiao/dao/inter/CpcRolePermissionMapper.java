package com.xiao.dao.inter;

import com.xiao.dao.dto.CpcRolePermission;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CpcRolePermissionMapper {
    int insert(CpcRolePermission record);

    int insertSelective(CpcRolePermission record);
}