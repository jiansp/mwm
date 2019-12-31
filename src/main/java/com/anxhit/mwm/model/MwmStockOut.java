package com.anxhit.mwm.model;

import java.math.BigDecimal;
import java.util.Date;

public class MwmStockOut {
    private String id;

    private String orgId;

    private String orgCode;

    private String hospitalId;

    private String hospitalCode;

    private String stockOutOrder;

    private BigDecimal totalWeight;

    private Integer totalCount;

    private Integer totalBag;

    private String stockOutUserId;

    private String stockOutUser;

    private Date stockOutTime;

    private String transferUserId;

    private String transferUserName;

    private String status;

    public MwmStockOut(String id, String orgId, String orgCode, String hospitalId, String hospitalCode, String stockOutOrder, BigDecimal totalWeight, Integer totalCount, Integer totalBag, String stockOutUserId, String stockOutUser, Date stockOutTime, String transferUserId, String transferUserName, String status) {
        this.id = id;
        this.orgId = orgId;
        this.orgCode = orgCode;
        this.hospitalId = hospitalId;
        this.hospitalCode = hospitalCode;
        this.stockOutOrder = stockOutOrder;
        this.totalWeight = totalWeight;
        this.totalCount = totalCount;
        this.totalBag = totalBag;
        this.stockOutUserId = stockOutUserId;
        this.stockOutUser = stockOutUser;
        this.stockOutTime = stockOutTime;
        this.transferUserId = transferUserId;
        this.transferUserName = transferUserName;
        this.status = status;
    }

    public MwmStockOut() {
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

    public String getStockOutOrder() {
        return stockOutOrder;
    }

    public void setStockOutOrder(String stockOutOrder) {
        this.stockOutOrder = stockOutOrder == null ? null : stockOutOrder.trim();
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

    public String getStockOutUserId() {
        return stockOutUserId;
    }

    public void setStockOutUserId(String stockOutUserId) {
        this.stockOutUserId = stockOutUserId == null ? null : stockOutUserId.trim();
    }

    public String getStockOutUser() {
        return stockOutUser;
    }

    public void setStockOutUser(String stockOutUser) {
        this.stockOutUser = stockOutUser == null ? null : stockOutUser.trim();
    }

    public Date getStockOutTime() {
        return stockOutTime;
    }

    public void setStockOutTime(Date stockOutTime) {
        this.stockOutTime = stockOutTime;
    }

    public String getTransferUserId() {
        return transferUserId;
    }

    public void setTransferUserId(String transferUserId) {
        this.transferUserId = transferUserId == null ? null : transferUserId.trim();
    }

    public String getTransferUserName() {
        return transferUserName;
    }

    public void setTransferUserName(String transferUserName) {
        this.transferUserName = transferUserName == null ? null : transferUserName.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}