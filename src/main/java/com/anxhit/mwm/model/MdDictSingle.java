package com.anxhit.mwm.model;

import java.util.Date;

public class MdDictSingle {
    private String id;

    private String orgId;

    private String orgCode;

    private String hospitalId;

    private String hospitalCode;

    private String itemId;

    private String itemCode;

    private String itemName;

    private String key;

    private String value;

    private String memo;

    private Integer sortNo;

    private String isStandard;

    private String status;

    private String phoneticCode;

    private String fiveStrokeCode;

    private String customizeCode;

    private String createdBy;

    private String createdByName;

    private Date createdAt;

    private String updatedBy;

    private String updatedByName;

    private Date updatedAt;

    private Integer dataVersion;

    private String deletedStatus;

    private Date deletedAt;

    public MdDictSingle(String id, String orgId, String orgCode, String hospitalId, String hospitalCode, String itemId, String itemCode, String itemName, String key, String value, String memo, Integer sortNo, String isStandard, String status, String phoneticCode, String fiveStrokeCode, String customizeCode, String createdBy, String createdByName, Date createdAt, String updatedBy, String updatedByName, Date updatedAt, Integer dataVersion, String deletedStatus, Date deletedAt) {
        this.id = id;
        this.orgId = orgId;
        this.orgCode = orgCode;
        this.hospitalId = hospitalId;
        this.hospitalCode = hospitalCode;
        this.itemId = itemId;
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.key = key;
        this.value = value;
        this.memo = memo;
        this.sortNo = sortNo;
        this.isStandard = isStandard;
        this.status = status;
        this.phoneticCode = phoneticCode;
        this.fiveStrokeCode = fiveStrokeCode;
        this.customizeCode = customizeCode;
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

    public MdDictSingle() {
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

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId == null ? null : itemId.trim();
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode == null ? null : itemCode.trim();
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName == null ? null : itemName.trim();
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key == null ? null : key.trim();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public Integer getSortNo() {
        return sortNo;
    }

    public void setSortNo(Integer sortNo) {
        this.sortNo = sortNo;
    }

    public String getIsStandard() {
        return isStandard;
    }

    public void setIsStandard(String isStandard) {
        this.isStandard = isStandard == null ? null : isStandard.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getPhoneticCode() {
        return phoneticCode;
    }

    public void setPhoneticCode(String phoneticCode) {
        this.phoneticCode = phoneticCode == null ? null : phoneticCode.trim();
    }

    public String getFiveStrokeCode() {
        return fiveStrokeCode;
    }

    public void setFiveStrokeCode(String fiveStrokeCode) {
        this.fiveStrokeCode = fiveStrokeCode == null ? null : fiveStrokeCode.trim();
    }

    public String getCustomizeCode() {
        return customizeCode;
    }

    public void setCustomizeCode(String customizeCode) {
        this.customizeCode = customizeCode == null ? null : customizeCode.trim();
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