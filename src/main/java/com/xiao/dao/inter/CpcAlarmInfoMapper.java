package com.xiao.dao.inter;

import com.xiao.dao.dto.CpcAlarmInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CpcAlarmInfoMapper {
    int deleteByPrimaryKey(String id);

    int insert(CpcAlarmInfo record);

    int insertSelective(CpcAlarmInfo record);

    CpcAlarmInfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(CpcAlarmInfo record);

    int updateByPrimaryKey(CpcAlarmInfo record);
}