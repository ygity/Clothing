package com.clothing.dao;

import com.clothing.common.vo.VCart;
import com.clothing.entity.Cart;

import java.util.List;

public interface CartMapper {


    int insert(Cart record);



    Cart selectByPrimaryKey(Integer caid);

    int updateByPrimaryKeySelective(Cart record);

    int updateByPrimaryKey(Cart record);

    //从购物车删除服装
    int deleteByPrimaryKey(Integer caid);

    //添加服装到购物车
    int insertSelective(Cart record);

    //展示用户购物车
    List<VCart> showUserCart(Integer uid);
}