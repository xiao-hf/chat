package com.xiao.dao.inter;

import com.xiao.dao.dto.CpcSysLoginLog;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CpcSysLoginLogMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CpcSysLoginLog record);

    int insertSelective(CpcSysLoginLog record);

    CpcSysLoginLog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CpcSysLoginLog record);

    int updateByPrimaryKey(CpcSysLoginLog record);
}