package com.anxhit.mwm.model;

import java.math.BigDecimal;
import java.util.Date;

public class MwmStockInDetail {
    private String id;

    private String stockInId;

    private String bagId;

    private String pointId;

    private String pointNo;

    private Integer count;

    private BigDecimal weight;

    private Date stockInTime;

    private String status;

    public MwmStockInDetail(String id, String stockInId, String bagId, String pointId, String pointNo, Integer count, BigDecimal weight, Date stockInTime, String status) {
        this.id = id;
        this.stockInId = stockInId;
        this.bagId = bagId;
        this.pointId = pointId;
        this.pointNo = pointNo;
        this.count = count;
        this.weight = weight;
        this.stockInTime = stockInTime;
        this.status = status;
    }

    public MwmStockInDetail() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getStockInId() {
        return stockInId;
    }

    public void setStockInId(String stockInId) {
        this.stockInId = stockInId == null ? null : stockInId.trim();
    }

    public String getBagId() {
        return bagId;
    }

    public void setBagId(String bagId) {
        this.bagId = bagId == null ? null : bagId.trim();
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

    public Date getStockInTime() {
        return stockInTime;
    }

    public void setStockInTime(Date stockInTime) {
        this.stockInTime = stockInTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}