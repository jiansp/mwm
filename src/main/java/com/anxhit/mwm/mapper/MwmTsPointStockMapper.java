package com.anxhit.mwm.mapper;

import com.anxhit.mwm.model.MwmTsPointStock;

public interface MwmTsPointStockMapper {
    int deleteByPrimaryKey(String id);

    int insert(MwmTsPointStock record);

    int insertSelective(MwmTsPointStock record);

    MwmTsPointStock selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(MwmTsPointStock record);

    int updateByPrimaryKeyWithBLOBs(MwmTsPointStock record);

    int updateByPrimaryKey(MwmTsPointStock record);
}