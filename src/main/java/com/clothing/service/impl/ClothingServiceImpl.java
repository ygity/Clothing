package com.clothing.service.impl;

import com.clothing.common.util.ResultUtil;
import com.clothing.common.vo.ResultVo;
import com.clothing.dao.ClothingMapper;
import com.clothing.entity.Clothing;
import com.clothing.service.ClothingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClothingServiceImpl implements ClothingService {

    @Autowired
    private ClothingMapper cloDao;
    @Override
    public ResultVo selectAll(Integer cid) {
        Clothing c = cloDao.selectAll(cid);
        if (c != null){
            return  ResultUtil.exec(true,"ok",c);
        }
        return ResultUtil.exec(false,"该等级不存在",null);
    }

    @Override
    public ResultVo selectByname(String clothingname) {
        clothingname = "%" + clothingname + "%";
        List<Clothing> list = cloDao.selectByName(clothingname);
        if (list != null){
            return ResultUtil.exec(true,"ok",list);
        }
        return ResultUtil.exec(false,"该等级不存在",null);
    }
}
