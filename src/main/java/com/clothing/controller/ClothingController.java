package com.clothing.controller;

import com.clothing.common.vo.ResultVo;
import com.clothing.service.ClothingService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class ClothingController {

    @Autowired
    private ClothingService closervice;

    @ApiOperation(value = "展示商品详情",notes = "根据传入二级菜单的展示出的cid展示其对应的商品详情")
    @PostMapping("showAll.do")
    public ResultVo checkUser(Integer cid){
        return closervice.selectAll(cid);
    }
}
