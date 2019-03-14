package com.clothing.dao;

import com.clothing.entity.OrderDetail;

public interface OrderDetailMapper {
    int deleteByPrimaryKey(Integer did);

    int insert(OrderDetail record);

    int insertSelective(OrderDetail record);

    OrderDetail selectByPrimaryKey(Integer did);

    int updateByPrimaryKeySelective(OrderDetail record);

    int updateByPrimaryKey(OrderDetail record);


}