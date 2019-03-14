package com.clothing.service.impl;


import com.clothing.common.token.TokenUtil;
import com.clothing.common.util.ResultUtil;
import com.clothing.common.vo.ResultVo;
import com.clothing.common.vo.VOrder;
import com.clothing.dao.OrderDetailMapper;
import com.clothing.dao.OrderMapper;

import com.clothing.entity.Order;
import com.clothing.entity.OrderDetail;
import com.clothing.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;


@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderDao;
    @Autowired
    private OrderDetailMapper detailDao;

    @Override
    public ResultVo findOrderByUid(String token) {
        int b = TokenUtil.parseToken(token).getId();
        List<VOrder> list = null;
        try {
            list = orderDao.findOrderByUid(b);
        } catch (Exception e) {
            e.printStackTrace();
            ResultUtil.exec(false,"未登录，请先登录",null);
        }

        return ResultUtil.exec(true,"ok",list);
    }



    @Override
    public ResultVo addOrder(Order order, OrderDetail orderDetail,String token) {

        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
            String uuid = UUID.randomUUID().toString().replace("-", "");
            int a = TokenUtil.parseToken(token).getId();
            order.setUid(a);
            order.setOrdernum("BL" + uuid + (sdf.format(new Date())));
            order.setCreatedate(sdf.parse(sdf.format(new Date())));
            orderDao.insertSelective(order);
            int oid = order.getOid();
            orderDetail.setOid(oid);
            detailDao.insertSelective(orderDetail);
            return  ResultUtil.exec(true,"ok",null);

        } catch (ParseException e) {
            e.printStackTrace();
            return ResultUtil.exec(false,"上传失败",null);
        }

    }
}
