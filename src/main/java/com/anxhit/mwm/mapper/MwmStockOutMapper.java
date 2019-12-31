package com.anxhit.mwm.mapper;

import com.anxhit.mwm.model.MwmStockOut;

public interface MwmStockOutMapper {
    int deleteByPrimaryKey(String id);

    int insert(MwmStockOut record);

    int insertSelective(MwmStockOut record);

    MwmStockOut selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(MwmStockOut record);

    int updateByPrimaryKey(MwmStockOut record);
}