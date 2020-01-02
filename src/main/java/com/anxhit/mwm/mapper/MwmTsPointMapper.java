package com.anxhit.mwm.mapper;

import com.anxhit.mwm.model.MwmTsPoint;

import java.util.List;

public interface MwmTsPointMapper {
    int deleteByPrimaryKey(String id);

    int insert(MwmTsPoint record);

    int insertSelective(MwmTsPoint record);

    MwmTsPoint selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(MwmTsPoint record);

    int updateByPrimaryKey(MwmTsPoint record);

    List find();
}