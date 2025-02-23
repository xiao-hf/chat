package com.xiao.dao.inter;

import com.xiao.dao.dto.CpcUnit;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CpcUnitMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CpcUnit record);

    int insertSelective(CpcUnit record);

    CpcUnit selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CpcUnit record);

    int updateByPrimaryKey(CpcUnit record);
}