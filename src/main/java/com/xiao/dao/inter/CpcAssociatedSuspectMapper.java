package com.xiao.dao.inter;

import com.xiao.dao.dto.CpcAssociatedSuspect;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CpcAssociatedSuspectMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CpcAssociatedSuspect record);

    int insertSelective(CpcAssociatedSuspect record);

    CpcAssociatedSuspect selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CpcAssociatedSuspect record);

    int updateByPrimaryKey(CpcAssociatedSuspect record);
}