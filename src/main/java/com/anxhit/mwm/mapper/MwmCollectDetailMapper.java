package com.anxhit.mwm.mapper;

import com.anxhit.mwm.model.MwmCollectDetail;

public interface MwmCollectDetailMapper {
    int deleteByPrimaryKey(String id);

    int insert(MwmCollectDetail record);

    int insertSelective(MwmCollectDetail record);

    MwmCollectDetail selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(MwmCollectDetail record);

    int updateByPrimaryKey(MwmCollectDetail record);
}