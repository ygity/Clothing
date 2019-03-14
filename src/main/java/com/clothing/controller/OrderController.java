package com.clothing.controller;

import com.clothing.common.vo.ResultVo;
import com.clothing.entity.Order;
import com.clothing.entity.OrderDetail;
import com.clothing.service.OrderService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class OrderController {

    @Autowired
    private OrderService orderService;

    @ApiOperation(value = "展示用户订单接口",notes = "展示用户个人订单")
    @PostMapping("findUserOrder.do")
    public ResultVo findOrderByUid(String token){

        return  orderService.findOrderByUid(token);
    }

    @ApiOperation(value = "添加用户订单接口",notes = "用户添加订单 传入参数：cid，num,state,totalprice,token， createdate,did,oid,ordernum是自增值")
    @PostMapping("addUserOrder.do")
    public ResultVo addUserOrder(Order order, OrderDetail orderDetail,String token){
        return  orderService.addOrder(order,orderDetail,token);
    }

}
