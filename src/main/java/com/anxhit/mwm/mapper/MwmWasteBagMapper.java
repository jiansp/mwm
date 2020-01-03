package com.anxhit.mwm.mapper;

import com.anxhit.mwm.model.MwmWasteBag;
import jdk.nashorn.internal.runtime.FindProperty;

import java.util.List;

public interface MwmWasteBagMapper {
    int deleteByPrimaryKey(String id);

    int insert(MwmWasteBag record);

    int insertSelective(MwmWasteBag record);

    MwmWasteBag selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(MwmWasteBag record);

    int updateByPrimaryKey(MwmWasteBag record);

    List find();
}