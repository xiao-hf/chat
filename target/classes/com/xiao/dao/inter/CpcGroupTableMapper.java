package com.xiao.dao.inter;

import com.xiao.dao.dto.CpcGroupTable;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CpcGroupTableMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CpcGroupTable record);

    int insertSelective(CpcGroupTable record);

    CpcGroupTable selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CpcGroupTable record);

    int updateByPrimaryKey(CpcGroupTable record);
}