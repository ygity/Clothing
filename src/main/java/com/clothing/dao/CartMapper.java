package com.clothing.dao;

import com.clothing.entity.Cart;

public interface CartMapper {
    int deleteByPrimaryKey(Integer caid);

    int insert(Cart record);

    int insertSelective(Cart record);

    Cart selectByPrimaryKey(Integer caid);

    int updateByPrimaryKeySelective(Cart record);

    int updateByPrimaryKey(Cart record);
}