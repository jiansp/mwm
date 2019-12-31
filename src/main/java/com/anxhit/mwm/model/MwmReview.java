package com.anxhit.mwm.model;

import java.math.BigDecimal;
import java.util.Date;

public class MwmReview {
    private String id;

    private String orgId;

    private String orgCode;

    private String hospitalId;

    private String hospitalCode;

    private BigDecimal totalWeight;

    private Integer totalCount;

    private Integer totalBag;

    private String reviewType;

    private String reviewUserId;

    private String reviewUser;

    private String trolleyId;

    private String trolleyNo;

    private String collectId;

    private Date reviewTime;

    private String status;

    public MwmReview(String id, String orgId, String orgCode, String hospitalId, String hospitalCode, BigDecimal totalWeight, Integer totalCount, Integer totalBag, String reviewType, String reviewUserId, String reviewUser, String trolleyId, String trolleyNo, String collectId, Date reviewTime, String status) {
        this.id = id;
        this.orgId = orgId;
        this.orgCode = orgCode;
        this.hospitalId = hospitalId;
        this.hospitalCode = hospitalCode;
        this.totalWeight = totalWeight;
        this.totalCount = totalCount;
        this.totalBag = totalBag;
        this.reviewType = reviewType;
        this.reviewUserId = reviewUserId;
        this.reviewUser = reviewUser;
        this.trolleyId = trolleyId;
        this.trolleyNo = trolleyNo;
        this.collectId = collectId;
        this.reviewTime = reviewTime;
        this.status = status;
    }

    public MwmReview() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode == null ? null : orgCode.trim();
    }

    public String getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(String hospitalId) {
        this.hospitalId = hospitalId == null ? null : hospitalId.trim();
    }

    public String getHospitalCode() {
        return hospitalCode;
    }

    public void setHospitalCode(String hospitalCode) {
        this.hospitalCode = hospitalCode == null ? null : hospitalCode.trim();
    }

    public BigDecimal getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(BigDecimal totalWeight) {
        this.totalWeight = totalWeight;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getTotalBag() {
        return totalBag;
    }

    public void setTotalBag(Integer totalBag) {
        this.totalBag = totalBag;
    }

    public String getReviewType() {
        return reviewType;
    }

    public void setReviewType(String reviewType) {
        this.reviewType = reviewType == null ? null : reviewType.trim();
    }

    public String getReviewUserId() {
        return reviewUserId;
    }

    public void setReviewUserId(String reviewUserId) {
        this.reviewUserId = reviewUserId == null ? null : reviewUserId.trim();
    }

    public String getReviewUser() {
        return reviewUser;
    }

    public void setReviewUser(String reviewUser) {
        this.reviewUser = reviewUser == null ? null : reviewUser.trim();
    }

    public String getTrolleyId() {
        return trolleyId;
    }

    public void setTrolleyId(String trolleyId) {
        this.trolleyId = trolleyId == null ? null : trolleyId.trim();
    }

    public String getTrolleyNo() {
        return trolleyNo;
    }

    public void setTrolleyNo(String trolleyNo) {
        this.trolleyNo = trolleyNo == null ? null : trolleyNo.trim();
    }

    public String getCollectId() {
        return collectId;
    }

    public void setCollectId(String collectId) {
        this.collectId = collectId == null ? null : collectId.trim();
    }

    public Date getReviewTime() {
        return reviewTime;
    }

    public void setReviewTime(Date reviewTime) {
        this.reviewTime = reviewTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}