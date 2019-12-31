package com.anxhit.mwm.model;

import java.util.Date;

public class MwmStockIn {
    private String id;

    private String orgId;

    private String orgCode;

    private String hospitalId;

    private String hospitalCode;

    private String stockInOrder;

    private String stockInUserId;

    private String stockInUser;

    private String trolleyId;

    private String trolleyNo;

    private String collectId;

    private Date stockInTime;

    private String status;

    public MwmStockIn(String id, String orgId, String orgCode, String hospitalId, String hospitalCode, String stockInOrder, String stockInUserId, String stockInUser, String trolleyId, String trolleyNo, String collectId, Date stockInTime, String status) {
        this.id = id;
        this.orgId = orgId;
        this.orgCode = orgCode;
        this.hospitalId = hospitalId;
        this.hospitalCode = hospitalCode;
        this.stockInOrder = stockInOrder;
        this.stockInUserId = stockInUserId;
        this.stockInUser = stockInUser;
        this.trolleyId = trolleyId;
        this.trolleyNo = trolleyNo;
        this.collectId = collectId;
        this.stockInTime = stockInTime;
        this.status = status;
    }

    public MwmStockIn() {
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

    public String getStockInOrder() {
        return stockInOrder;
    }

    public void setStockInOrder(String stockInOrder) {
        this.stockInOrder = stockInOrder == null ? null : stockInOrder.trim();
    }

    public String getStockInUserId() {
        return stockInUserId;
    }

    public void setStockInUserId(String stockInUserId) {
        this.stockInUserId = stockInUserId == null ? null : stockInUserId.trim();
    }

    public String getStockInUser() {
        return stockInUser;
    }

    public void setStockInUser(String stockInUser) {
        this.stockInUser = stockInUser == null ? null : stockInUser.trim();
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