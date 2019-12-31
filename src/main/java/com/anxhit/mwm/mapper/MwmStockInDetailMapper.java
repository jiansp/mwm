package com.anxhit.mwm.mapper;

import com.anxhit.mwm.model.MwmStockInDetail;

public interface MwmStockInDetailMapper {
    int deleteByPrimaryKey(String id);

    int insert(MwmStockInDetail record);

    int insertSelective(MwmStockInDetail record);

    MwmStockInDetail selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(MwmStockInDetail record);

    int updateByPrimaryKey(MwmStockInDetail record);
}