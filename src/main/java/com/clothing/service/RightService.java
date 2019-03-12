package com.clothing.service;

import com.clothing.common.vo.ResultVo;
import com.clothing.vo.VMwnuInfo;

import java.util.List;

public interface RightService {
    ResultVo select(Integer tid);
    ResultVo selectAllOne();
}
