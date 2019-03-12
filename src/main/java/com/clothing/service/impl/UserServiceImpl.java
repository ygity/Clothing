package com.clothing.service.impl;

import com.clothing.common.token.TokenUtil;
import com.clothing.common.util.ResultUtil;
import com.clothing.common.vo.ResultVo;
import com.clothing.dao.UserMapper;
import com.clothing.entity.User;
import com.clothing.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userdao;

    @Override
    public ResultVo login(String uname, String password) {

        User user = userdao.selectByName(uname);
        if(user!= null){
            if(user.getPassword().equals(password)){
                String token = TokenUtil.createToken(user);
                return ResultUtil.exec(true,"ok",token);
            }
        }

        return ResultUtil.exec(false,"用户名或者密码错误",null);
    }

    @Override
    public ResultVo checkUser(String uname) {
       User user = userdao.selectByName(uname);
       if(user!= null){
           return  ResultUtil.exec(true,"ok",null);
       }

        return ResultUtil.exec(false,"该用户不存在",null);
    }

    @Override
    public ResultVo insert(User user) {

       User a = userdao.selectByName(user.getUname());
       if(a == null){
           Integer  b =  userdao.insert(user);
           if(b> 0){
               return  ResultUtil.exec(true,"ok",null);
           }
           return  ResultUtil.exec(false,"注册失败",null);
       }
        return ResultUtil.exec(false,"该用户已存在",null);
    }
}
