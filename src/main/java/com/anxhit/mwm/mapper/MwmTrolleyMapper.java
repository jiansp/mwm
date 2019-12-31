package com.anxhit.mwm.mapper;

import com.anxhit.mwm.model.MwmTrolley;

public interface MwmTrolleyMapper {
    int deleteByPrimaryKey(String id);

    int insert(MwmTrolley record);

    int insertSelective(MwmTrolley record);

    MwmTrolley selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(MwmTrolley record);

    int updateByPrimaryKey(MwmTrolley record);
}