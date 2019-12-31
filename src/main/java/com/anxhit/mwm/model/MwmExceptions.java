package com.anxhit.mwm.model;

import java.util.Date;

public class MwmExceptions {
    private String id;

    private String orgId;

    private String orgCode;

    private String hospitalId;

    private String hospitalCode;

    private String bagId;

    private String exceptionAt;

    private String exceptionType;

    private String exceptionDesc;

    private String exceptionVoicePath;

    private String recordUserId;

    private String recordUserName;

    private String confirmUserId;

    private String confirmUserName;

    private String auditUserId;

    private String auditUserName;

    private Date recordTime;

    private Date confirmTime;

    private String status;

    private String createdBy;

    private String createdByName;

    private Date createdAt;

    private String updatedBy;

    private String updatedByName;

    private Date updatedAt;

    private Integer dataVersion;

    private String deletedStatus;

    private Date deletedAt;

    public MwmExceptions(String id, String orgId, String orgCode, String hospitalId, String hospitalCode, String bagId, String exceptionAt, String exceptionType, String exceptionDesc, String exceptionVoicePath, String recordUserId, String recordUserName, String confirmUserId, String confirmUserName, String auditUserId, String auditUserName, Date recordTime, Date confirmTime, String status, String createdBy, String createdByName, Date createdAt, String updatedBy, String updatedByName, Date updatedAt, Integer dataVersion, String deletedStatus, Date deletedAt) {
        this.id = id;
        this.orgId = orgId;
        this.orgCode = orgCode;
        this.hospitalId = hospitalId;
        this.hospitalCode = hospitalCode;
        this.bagId = bagId;
        this.exceptionAt = exceptionAt;
        this.exceptionType = exceptionType;
        this.exceptionDesc = exceptionDesc;
        this.exceptionVoicePath = exceptionVoicePath;
        this.recordUserId = recordUserId;
        this.recordUserName = recordUserName;
        this.confirmUserId = confirmUserId;
        this.confirmUserName = confirmUserName;
        this.auditUserId = auditUserId;
        this.auditUserName = auditUserName;
        this.recordTime = recordTime;
        this.confirmTime = confirmTime;
        this.status = status;
        this.createdBy = createdBy;
        this.createdByName = createdByName;
        this.createdAt = createdAt;
        this.updatedBy = updatedBy;
        this.updatedByName = updatedByName;
        this.updatedAt = updatedAt;
        this.dataVersion = dataVersion;
        this.deletedStatus = deletedStatus;
        this.deletedAt = deletedAt;
    }

    public MwmExceptions() {
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

    public String getBagId() {
        return bagId;
    }

    public void setBagId(String bagId) {
        this.bagId = bagId == null ? null : bagId.trim();
    }

    public String getExceptionAt() {
        return exceptionAt;
    }

    public void setExceptionAt(String exceptionAt) {
        this.exceptionAt = exceptionAt == null ? null : exceptionAt.trim();
    }

    public String getExceptionType() {
        return exceptionType;
    }

    public void setExceptionType(String exceptionType) {
        this.exceptionType = exceptionType == null ? null : exceptionType.trim();
    }

    public String getExceptionDesc() {
        return exceptionDesc;
    }

    public void setExceptionDesc(String exceptionDesc) {
        this.exceptionDesc = exceptionDesc == null ? null : exceptionDesc.trim();
    }

    public String getExceptionVoicePath() {
        return exceptionVoicePath;
    }

    public void setExceptionVoicePath(String exceptionVoicePath) {
        this.exceptionVoicePath = exceptionVoicePath == null ? null : exceptionVoicePath.trim();
    }

    public String getRecordUserId() {
        return recordUserId;
    }

    public void setRecordUserId(String recordUserId) {
        this.recordUserId = recordUserId == null ? null : recordUserId.trim();
    }

    public String getRecordUserName() {
        return recordUserName;
    }

    public void setRecordUserName(String recordUserName) {
        this.recordUserName = recordUserName == null ? null : recordUserName.trim();
    }

    public String getConfirmUserId() {
        return confirmUserId;
    }

    public void setConfirmUserId(String confirmUserId) {
        this.confirmUserId = confirmUserId == null ? null : confirmUserId.trim();
    }

    public String getConfirmUserName() {
        return confirmUserName;
    }

    public void setConfirmUserName(String confirmUserName) {
        this.confirmUserName = confirmUserName == null ? null : confirmUserName.trim();
    }

    public String getAuditUserId() {
        return auditUserId;
    }

    public void setAuditUserId(String auditUserId) {
        this.auditUserId = auditUserId == null ? null : auditUserId.trim();
    }

    public String getAuditUserName() {
        return auditUserName;
    }

    public void setAuditUserName(String auditUserName) {
        this.auditUserName = auditUserName == null ? null : auditUserName.trim();
    }

    public Date getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(Date recordTime) {
        this.recordTime = recordTime;
    }

    public Date getConfirmTime() {
        return confirmTime;
    }

    public void setConfirmTime(Date confirmTime) {
        this.confirmTime = confirmTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
    }

    public String getCreatedByName() {
        return createdByName;
    }

    public void setCreatedByName(String createdByName) {
        this.createdByName = createdByName == null ? null : createdByName.trim();
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy == null ? null : updatedBy.trim();
    }

    public String getUpdatedByName() {
        return updatedByName;
    }

    public void setUpdatedByName(String updatedByName) {
        this.updatedByName = updatedByName == null ? null : updatedByName.trim();
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Integer getDataVersion() {
        return dataVersion;
    }

    public void setDataVersion(Integer dataVersion) {
        this.dataVersion = dataVersion;
    }

    public String getDeletedStatus() {
        return deletedStatus;
    }

    public void setDeletedStatus(String deletedStatus) {
        this.deletedStatus = deletedStatus == null ? null : deletedStatus.trim();
    }

    public Date getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Date deletedAt) {
        this.deletedAt = deletedAt;
    }
}