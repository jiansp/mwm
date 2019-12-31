package com.anxhit.mwm.model;

import java.math.BigDecimal;
import java.util.Date;

public class MwmStockOutDetail {
    private String id;

    private String stockOutId;

    private String bagId;

    private Integer count;

    private BigDecimal weight;

    private String pointId;

    private String pointNo;

    private Date stockOutTime;

    private String status;

    public MwmStockOutDetail(String id, String stockOutId, String bagId, Integer count, BigDecimal weight, String pointId, String pointNo, Date stockOutTime, String status) {
        this.id = id;
        this.stockOutId = stockOutId;
        this.bagId = bagId;
        this.count = count;
        this.weight = weight;
        this.pointId = pointId;
        this.pointNo = pointNo;
        this.stockOutTime = stockOutTime;
        this.status = status;
    }

    public MwmStockOutDetail() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getStockOutId() {
        return stockOutId;
    }

    public void setStockOutId(String stockOutId) {
        this.stockOutId = stockOutId == null ? null : stockOutId.trim();
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

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public String getPointId() {
        return pointId;
    }

    public void setPointId(String pointId) {
        this.pointId = pointId == null ? null : pointId.trim();
    }

    public String getPointNo() {
        return pointNo;
    }

    public void setPointNo(String pointNo) {
        this.pointNo = pointNo == null ? null : pointNo.trim();
    }

    public Date getStockOutTime() {
        return stockOutTime;
    }

    public void setStockOutTime(Date stockOutTime) {
        this.stockOutTime = stockOutTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}