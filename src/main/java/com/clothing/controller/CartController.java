package com.clothing.controller;

import com.clothing.common.vo.ResultVo;
import com.clothing.entity.Cart;
import com.clothing.service.CartService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class CartController {
    @Autowired
    private CartService cartService;

    @ApiOperation(value = "删除用户购物车接口",notes = "根据购物车的id删除购物车")
    @PostMapping("deleteUserCart.do")
    public ResultVo deleteByPrimaryKey(Integer caid){
        return cartService.deleteByPrimaryKey(caid);
    }

    @ApiOperation(value = "添加用户购物车接口",notes = "参数为cart ,token,添加购物车时num默认为一")
    @PostMapping("insertUserCart.do")
    public ResultVo insertSelective(Cart cart ,String token){
    return  cartService.insertSelective(cart,token);

    }
    @ApiOperation(value = "展示用户购物车接口",notes = "传入参数为token值")
    @PostMapping("showUserCart.do")
    public ResultVo showUserCart(String token){
        return  cartService.showUserCart(token);
    }

}
