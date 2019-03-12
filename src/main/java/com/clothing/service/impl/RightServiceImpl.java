package com.clothing.service.impl;

import com.clothing.common.util.ResultUtil;
import com.clothing.common.vo.ResultVo;
import com.clothing.dao.TypeMapper;
import com.clothing.entity.Type;
import com.clothing.service.RightService;
import com.clothing.vo.VMwnuInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class RightServiceImpl implements RightService {

    @Autowired
    private TypeMapper typeDao;

    @Override
    public ResultVo select(Integer tid) {
        List<VMwnuInfo> list = typeDao.select(tid);
        if (list != null){
            return  ResultUtil.exec(true,"ok",list);
        }
      return ResultUtil.exec(false,"该等级不存在",null);
    }

    @Override
    public ResultVo selectAllOne() {
        List<Type> list = typeDao.selectAllone();
        if (list != null){
            return  ResultUtil.exec(true,"ok",list);
        }
        return ResultUtil.exec(false,"该等级不存在",null);
    }
}
