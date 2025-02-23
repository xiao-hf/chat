package com.xiao.dao.inter;

import com.xiao.dao.dto.CpcSysOperationLog;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CpcSysOperationLogMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CpcSysOperationLog record);

    int insertSelective(CpcSysOperationLog record);

    CpcSysOperationLog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CpcSysOperationLog record);

    int updateByPrimaryKey(CpcSysOperationLog record);
}