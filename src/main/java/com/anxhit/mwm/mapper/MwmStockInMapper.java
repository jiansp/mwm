package com.anxhit.mwm.mapper;

import com.anxhit.mwm.model.MwmStockIn;

public interface MwmStockInMapper {
    int deleteByPrimaryKey(String id);

    int insert(MwmStockIn record);

    int insertSelective(MwmStockIn record);

    MwmStockIn selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(MwmStockIn record);

    int updateByPrimaryKey(MwmStockIn record);
}