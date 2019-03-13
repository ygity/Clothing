package com.clothing.dao;

import com.clothing.entity.Type;
import com.clothing.vo.VMwnuInfo;
import com.clothing.vo.Vvinfo;

import java.util.List;

public interface TypeMapper {
    int deleteByPrimaryKey(Integer tid);

    int insert(Type record);

    int insertSelective(Type record);

    Type selectByPrimaryKey(Integer tid);

    int updateByPrimaryKeySelective(Type record);

    int updateByPrimaryKey(Type record);

    List<VMwnuInfo> select(Integer tid);

    List<Type> selectAllone();

    List<Vvinfo> selectAll(Integer tid);
}