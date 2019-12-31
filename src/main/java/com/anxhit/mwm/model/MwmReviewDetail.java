package com.anxhit.mwm.model;

import java.math.BigDecimal;

public class MwmReviewDetail {
    private String id;

    private String reviewId;

    private String bagId;

    private Integer count;

    private BigDecimal collectWeight;

    private BigDecimal reviewWeight;

    private String status;

    public MwmReviewDetail(String id, String reviewId, String bagId, Integer count, BigDecimal collectWeight, BigDecimal reviewWeight, String status) {
        this.id = id;
        this.reviewId = reviewId;
        this.bagId = bagId;
        this.count = count;
        this.collectWeight = collectWeight;
        this.reviewWeight = reviewWeight;
        this.status = status;
    }

    public MwmReviewDetail() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getReviewId() {
        return reviewId;
    }

    public void setReviewId(String reviewId) {
        this.reviewId = reviewId == null ? null : reviewId.trim();
    }

    public String getBagId() {
        return bagId;
    }

    public void setBagId(String bagId) {
        this.bagId = bagId == null ? null : bagId.trim();
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public BigDecimal getCollectWeight() {
        return collectWeight;
    }

    public void setCollectWeight(BigDecimal collectWeight) {
        this.collectWeight = collectWeight;
    }

    public BigDecimal getReviewWeight() {
        return reviewWeight;
    }

    public void setReviewWeight(BigDecimal reviewWeight) {
        this.reviewWeight = reviewWeight;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}