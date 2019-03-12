package com.clothing.controller;


import com.clothing.common.vo.ResultVo;
import com.clothing.entity.User;
import com.clothing.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "登录接口",notes = "根据账号密码登录，登录前会判断该账号是否存在")
    @PostMapping("login.do")
    public ResultVo login(String uname,String password){
        return userService.login(uname,password);

    }
    @ApiOperation(value = "检查该用户是否存在",notes = "根据用户输入的账号，判断该用户是否存在")
   @PostMapping("checkUser.do")
    public ResultVo checkUser(String uname){
        return  userService.checkUser(uname);
    }

    @ApiOperation(value = "",notes = "用户注册，用户id不用传")
    @PostMapping("insert.do")
   public ResultVo insert(User user){
       return  userService.insert(user);
   }
}
