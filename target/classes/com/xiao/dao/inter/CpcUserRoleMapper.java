package com.xiao.dao.inter;

import com.xiao.dao.dto.CpcUserRole;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CpcUserRoleMapper {
    int insert(CpcUserRole record);

    int insertSelective(CpcUserRole record);
}