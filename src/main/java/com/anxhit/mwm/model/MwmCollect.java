package com.anxhit.mwm.model;

import java.util.Date;

public class MwmCollect {
    private String id;

    private String orgId;

    private String orgCode;

    private String hospitalId;

    private String hospitalCode;

    private String trolleyId;

    private String trolleyNo;

    private Date startTime;

    private Date endTime;

    private String collectManId;

    private String collectMan;

    private String status;

    public MwmCollect(String id, String orgId, String orgCode, String hospitalId, String hospitalCode, String trolleyId, String trolleyNo, Date startTime, Date endTime, String collectManId, String collectMan, String status) {
        this.id = id;
        this.orgId = orgId;
        this.orgCode = orgCode;
        this.hospitalId = hospitalId;
        this.hospitalCode = hospitalCode;
        this.trolleyId = trolleyId;
        this.trolleyNo = trolleyNo;
        this.startTime = startTime;
        this.endTime = endTime;
        this.collectManId = collectManId;
        this.collectMan = collectMan;
        this.status = status;
    }

    public MwmCollect() {
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

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getCollectManId() {
        return collectManId;
    }

    public void setCollectManId(String collectManId) {
        this.collectManId = collectManId == null ? null : collectManId.trim();
    }

    public String getCollectMan() {
        return collectMan;
    }

    public void setCollectMan(String collectMan) {
        this.collectMan = collectMan == null ? null : collectMan.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}