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

    @ApiOperation(value = "用户注册接口",notes = "用户注册，用户id不用传")
    @PostMapping("insert.do")
   public ResultVo insert(User user){
       return  userService.insert(user);
   }

   @ApiOperation(value = "查找密码接口",notes = "通过用户名和手机号查找密码,用户输入用户名和密码，返回密码")
   @PostMapping("findPassword.do")
   public ResultVo findPassword(String uname,String phone){
        return  userService.findPasswordByNameAndPhone(uname,phone);
   }

    @ApiOperation(value = "通过用户名和手机号查找用户接口",notes = "通过用户名和手机号查找用户，为修改密码提供参数：用户名和手机号")
    @PostMapping("findUser.do")
    public ResultVo findUser(String uname,String phone){
        return  userService.finduserByNameAndPhone(uname,phone);
    }


   @ApiOperation(value = "修改密码接口",notes = "当用户未登录时忘记密码，通过用户名和手机号修改密码,参数需要传入用户名，手机号，和新的密码")
   @PostMapping("updatePassword.do")
   public  ResultVo updatePassword(User user){
        return  userService.updatePassword(user);
   }
}
