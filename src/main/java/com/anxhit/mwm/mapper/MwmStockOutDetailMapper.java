package com.anxhit.mwm.mapper;

import com.anxhit.mwm.model.MwmStockOutDetail;

public interface MwmStockOutDetailMapper {
    int deleteByPrimaryKey(String id);

    int insert(MwmStockOutDetail record);

    int insertSelective(MwmStockOutDetail record);

    MwmStockOutDetail selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(MwmStockOutDetail record);

    int updateByPrimaryKey(MwmStockOutDetail record);
}