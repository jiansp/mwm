package com.anxhit.mwm.mapper;

import com.anxhit.mwm.model.MwmTsPoint;

public interface MwmTsPointMapper {
    int deleteByPrimaryKey(String id);

    int insert(MwmTsPoint record);

    int insertSelective(MwmTsPoint record);

    MwmTsPoint selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(MwmTsPoint record);

    int updateByPrimaryKey(MwmTsPoint record);
}