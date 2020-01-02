package com.anxhit.mwm.mapper;

import com.anxhit.mwm.model.MwmTemporaryStorage;

import java.util.List;

public interface MwmTemporaryStorageMapper {
    int deleteByPrimaryKey(String id);

    int insert(MwmTemporaryStorage record);

    int insertSelective(MwmTemporaryStorage record);

    MwmTemporaryStorage selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(MwmTemporaryStorage record);

    int updateByPrimaryKey(MwmTemporaryStorage record);

    List find();
}