package com.xiao.dao.inter;

import com.xiao.dao.dto.CpcUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CpcUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CpcUser record);

    int insertSelective(CpcUser record);

    CpcUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CpcUser record);

    List<CpcUser> selectByAll(CpcUser cpcUser);
}