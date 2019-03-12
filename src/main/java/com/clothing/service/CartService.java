package com.clothing.service;

import com.clothing.common.vo.ResultVo;
import com.clothing.entity.Cart;


public interface CartService {

    //从购物车删除服装
    ResultVo deleteByPrimaryKey(Integer caid);

    //添加服装到购物车
    ResultVo insertSelective(Cart cart,String token);

    //展示用户购物车
   ResultVo showUserCart(String token);
}
