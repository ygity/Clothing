package com.clothing.controller;

import com.clothing.common.vo.ResultVo;
import com.clothing.service.RightService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class TypeController {
    @Autowired
    private RightService typeservice;

    @ApiOperation(value = "分级查询",notes = "根据输入的一级菜单的编号展示其对应的二级菜单")
    @PostMapping("showlevel.do")
    public ResultVo checkUser(Integer tid){
        return  typeservice.select(tid);
    }

    @ApiOperation(value = "一级菜单的总查询",notes = "展示所有的一级菜单")
    @PostMapping("showlevelone.do")
    public ResultVo selectOne(){
        return  typeservice.selectAllOne();
    }

    @ApiOperation(value = "查询对应的所有商品查询",notes = "根据输入的二级菜单的号查询对应的所有商品")
    @PostMapping("selectAll.do")
    public ResultVo select(Integer tid){
        return  typeservice.selectAll(tid);
    }
}
