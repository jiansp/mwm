package com.anxhit.mwm.mapper;

import com.anxhit.mwm.model.MwmReviewDetail;

public interface MwmReviewDetailMapper {
    int deleteByPrimaryKey(String id);

    int insert(MwmReviewDetail record);

    int insertSelective(MwmReviewDetail record);

    MwmReviewDetail selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(MwmReviewDetail record);

    int updateByPrimaryKey(MwmReviewDetail record);
}