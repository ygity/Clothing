package com.clothing.service;

import com.clothing.common.vo.ResultVo;

import com.clothing.entity.Order;
import com.clothing.entity.OrderDetail;


public interface OrderService {
    //展示用户订单
     ResultVo  findOrderByUid(String token);

    //添加用户订单
    ResultVo addOrder(Order order, OrderDetail orderDetail,String token);
}
