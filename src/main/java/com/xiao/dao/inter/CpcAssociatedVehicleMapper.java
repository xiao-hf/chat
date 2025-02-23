package com.xiao.dao.inter;

import com.xiao.dao.dto.CpcAssociatedVehicle;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CpcAssociatedVehicleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CpcAssociatedVehicle record);

    int insertSelective(CpcAssociatedVehicle record);

    CpcAssociatedVehicle selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CpcAssociatedVehicle record);

    int updateByPrimaryKey(CpcAssociatedVehicle record);
}