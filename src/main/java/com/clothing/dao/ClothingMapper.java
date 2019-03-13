package com.clothing.dao;

import com.clothing.entity.Clothing;

public interface ClothingMapper {
    int deleteByPrimaryKey(Integer cid);

    int insert(Clothing record);

    int insertSelective(Clothing record);

    Clothing selectByPrimaryKey(Integer cid);

    int updateByPrimaryKeySelective(Clothing record);

    int updateByPrimaryKey(Clothing record);

    Clothing selectAll(Integer cid);
}