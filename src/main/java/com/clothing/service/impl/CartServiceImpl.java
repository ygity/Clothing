package com.clothing.service.impl;

import com.clothing.common.token.TokenUtil;
import com.clothing.common.util.ResultUtil;
import com.clothing.common.vo.ResultVo;
import com.clothing.common.vo.VCart;
import com.clothing.dao.CartMapper;
import com.clothing.entity.Cart;

import com.clothing.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceImpl implements CartService {

    @Autowired
    private CartMapper cartDao;


    @Override
    public ResultVo deleteByPrimaryKey(Integer caid) {

            cartDao.deleteByPrimaryKey(caid);
        return ResultUtil.exec(true,"ok",null);
    }

    @Override
    public ResultVo insertSelective(Cart cart ,String token) {

    int a =  TokenUtil.parseToken(token).getId();
        Cart c =  new Cart();
        c.setCid(cart.getCid());
        c.setNum(1);
        c.setUid(a);
        c.setCaid(cart.getCaid());
        cartDao.insertSelective(c);
        return ResultUtil.exec(true,"ok",null);
    }

    @Override
    public ResultVo showUserCart(String token) {

        int b = TokenUtil.parseToken(token).getId();
        List<VCart> list  = null;
        try {
            list = cartDao.showUserCart(b);

        } catch (Exception e) {
            e.printStackTrace();
             ResultUtil.exec(false,"请先登录",null);
        }

         return  ResultUtil.exec(true,"ok",list);
    }
}
