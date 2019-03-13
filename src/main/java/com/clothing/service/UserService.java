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

    //通过用户名和电话号码找回密码
    ResultVo findPasswordByNameAndPhone(String uname,String phone);


    //通过用户名和电话号码查找用户
    ResultVo finduserByNameAndPhone(String uname,String phone);


    //通过用户名和手机号修改密码
    ResultVo updatePassword(User user);

}
