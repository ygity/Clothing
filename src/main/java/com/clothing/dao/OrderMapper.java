package com.clothing.dao;

import com.clothing.common.vo.VOrder;
import com.clothing.entity.Order;

import java.util.List;

public interface OrderMapper {
    int deleteByPrimaryKey(Integer oid);

    int insert(Order record);

    Order selectByPrimaryKey(Integer oid);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);

    //添加订单
    int insertSelective(Order record);
    //展示订单
    List<VOrder> findOrderByUid(Integer uid);
}