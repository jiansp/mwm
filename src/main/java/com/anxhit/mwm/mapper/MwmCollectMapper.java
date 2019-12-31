package com.anxhit.mwm.mapper;

import com.anxhit.mwm.model.MwmCollect;

public interface MwmCollectMapper {
    int deleteByPrimaryKey(String id);

    int insert(MwmCollect record);

    int insertSelective(MwmCollect record);

    MwmCollect selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(MwmCollect record);

    int updateByPrimaryKey(MwmCollect record);
}