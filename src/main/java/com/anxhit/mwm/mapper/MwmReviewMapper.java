package com.anxhit.mwm.mapper;

import com.anxhit.mwm.model.MwmReview;

public interface MwmReviewMapper {
    int deleteByPrimaryKey(String id);

    int insert(MwmReview record);

    int insertSelective(MwmReview record);

    MwmReview selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(MwmReview record);

    int updateByPrimaryKey(MwmReview record);
}