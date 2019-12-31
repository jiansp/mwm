package com.anxhit.mwm.mapper;

import com.anxhit.mwm.model.MwmExceptions;

public interface MwmExceptionsMapper {
    int deleteByPrimaryKey(String id);

    int insert(MwmExceptions record);

    int insertSelective(MwmExceptions record);

    MwmExceptions selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(MwmExceptions record);

    int updateByPrimaryKey(MwmExceptions record);
}