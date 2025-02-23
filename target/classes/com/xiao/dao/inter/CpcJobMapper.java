package com.xiao.dao.inter;

import com.xiao.dao.dto.CpcJob;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CpcJobMapper {
    int deleteByPrimaryKey(Long jobId);

    int insert(CpcJob record);

    int insertSelective(CpcJob record);

    CpcJob selectByPrimaryKey(Long jobId);

    int updateByPrimaryKeySelective(CpcJob record);

    int updateByPrimaryKey(CpcJob record);
}