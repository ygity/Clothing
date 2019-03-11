package com.clothing.dao;

import com.clothing.entity.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer uid);



    int insertSelective(User record);

    User selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    //注册
    int insert(User record);

    //登录
    User selectByName(String uname);


}