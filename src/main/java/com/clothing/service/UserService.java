package com.clothing.service;

import com.clothing.common.vo.ResultVo;
import com.clothing.entity.User;

public interface UserService {

    //登录
    ResultVo login(String uname,String password);
    //判断该用户是否存在
    ResultVo checkUser(String uname);
    //注册
    ResultVo insert(User user);

}
