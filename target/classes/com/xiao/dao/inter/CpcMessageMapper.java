package com.xiao.dao.inter;

import com.xiao.dao.dto.CpcMessage;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CpcMessageMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CpcMessage record);

    int insertSelective(CpcMessage record);

    CpcMessage selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CpcMessage record);

    int updateByPrimaryKey(CpcMessage record);

    List<CpcMessage> selectAll();
}