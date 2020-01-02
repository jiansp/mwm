package com.anxhit.mwm.services;

import com.anxhit.mwm.cache.Cache;
import com.anxhit.mwm.mapper.MwmExceptionsMapper;
import com.anxhit.mwm.mapper.MwmReviewDetailMapper;
import com.anxhit.mwm.mapper.MwmReviewMapper;
import com.anxhit.mwm.mapper.MwmWasteBagMapper;
import com.anxhit.mwm.model.MwmExceptions;
import com.anxhit.mwm.model.MwmReview;
import com.anxhit.mwm.model.MwmReviewDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Service
public class ReviewService {
    @Autowired
    private MwmReviewMapper reviewMapper;
    @Autowired
    private MwmReviewDetailMapper reviewDetailMapper;
    @Autowired
    private MwmWasteBagMapper wasteBagMapper;
    @Autowired
    private MwmExceptionsMapper exceptionsMapper;

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public Map save() {
        Date now = new Date();
        Map map = new HashMap();
        MwmReview review = new MwmReview();
        review.setOrgId(Cache.ORG.getId());
        review.setOrgCode(Cache.ORG.getCode());
        review.setHospitalId(Cache.HOSPITAL.getId());
        review.setHospitalCode(Cache.HOSPITAL.getCode());
        review.setTotalWeight(Cache.WASTE_BAG.getWeight());
        review.setTotalBag(1);
        review.setReviewType("2");
        review.setReviewTime(now);
        review.setCollectId(Cache.COLLECT.getId());
        review.setTrolleyId(Cache.TROLLEY.getId());
        review.setTrolleyNo(Cache.TROLLEY.getTrolleyNo());
        this.reviewMapper.insert(review);
        map.put("review", review);

        MwmReviewDetail reviewDetail = new MwmReviewDetail();
        reviewDetail.setReviewId(review.getId());
        reviewDetail.setBagId(Cache.WASTE_BAG.getId());
        reviewDetail.setCollectWeight(Cache.WASTE_BAG.getWeight());
        reviewDetail.setReviewWeight(Cache.WASTE_BAG.getWeight());
        this.reviewDetailMapper.insert(reviewDetail);
        map.put("reviewDetail", reviewDetail);
        Cache.WASTE_BAG.setStatus("3");
        this.wasteBagMapper.updateByPrimaryKey(Cache.WASTE_BAG);
        map.put("wasteBag", Cache.WASTE_BAG);
        return map;
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public Map exceptionSave() {
        Date now = new Date();
        Map map = new HashMap();
        MwmReview review = new MwmReview();
        review.setOrgId(Cache.ORG.getId());
        review.setOrgCode(Cache.ORG.getCode());
        review.setHospitalId(Cache.HOSPITAL.getId());
        review.setHospitalCode(Cache.HOSPITAL.getCode());
        review.setTotalWeight(Cache.WASTE_BAG.getWeight());
        review.setTotalBag(1);
        review.setReviewType("2");
        review.setReviewTime(now);
        review.setCollectId(Cache.COLLECT.getId());
        review.setTrolleyId(Cache.TROLLEY.getId());
        review.setTrolleyNo(Cache.TROLLEY.getTrolleyNo());
        this.reviewMapper.insert(review);
        map.put("review", review);

        MwmReviewDetail reviewDetail = new MwmReviewDetail();
        reviewDetail.setReviewId(review.getId());
        reviewDetail.setBagId(Cache.WASTE_BAG.getId());
        reviewDetail.setCollectWeight(Cache.WASTE_BAG.getWeight());
        reviewDetail.setReviewWeight(Cache.WASTE_BAG.getWeight());
        this.reviewDetailMapper.insert(reviewDetail);
        map.put("reviewDetail", reviewDetail);
        Cache.WASTE_BAG.setExceptionStatus("1");
        this.wasteBagMapper.updateByPrimaryKey(Cache.WASTE_BAG);
        map.put("wasteBag", Cache.WASTE_BAG);
        MwmExceptions exceptions = new MwmExceptions();
        exceptions.setBagId(Cache.WASTE_BAG.getId());
        exceptions.setOrgId(Cache.ORG.getId());
        exceptions.setOrgCode(Cache.ORG.getCode());
        exceptions.setHospitalId(Cache.HOSPITAL.getId());
        exceptions.setHospitalCode(Cache.HOSPITAL.getCode());
        exceptions.setRecordTime(now);
        exceptions.setStatus("1");
        this.exceptionsMapper.insert(exceptions);
        map.put("exceptions", exceptions);
        Cache.EXCEPTIONS = exceptions;
        return map;
    }
}
