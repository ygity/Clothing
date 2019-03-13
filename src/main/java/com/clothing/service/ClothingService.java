package com.clothing.service;

import com.clothing.common.vo.ResultVo;
import com.clothing.entity.Clothing;

public interface ClothingService {
    ResultVo selectAll(Integer cid);

    ResultVo selectByname(String clothingname);
}
