package com.anxhit.mwm.mapper;

import com.anxhit.mwm.model.MwmWasteBag;

public interface MwmWasteBagMapper {
    int deleteByPrimaryKey(String id);

    int insert(MwmWasteBag record);

    int insertSelective(MwmWasteBag record);

    MwmWasteBag selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(MwmWasteBag record);

    int updateByPrimaryKey(MwmWasteBag record);
}