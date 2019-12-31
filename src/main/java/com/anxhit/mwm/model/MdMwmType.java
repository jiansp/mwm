package com.anxhit.mwm.model;

import java.util.Date;

public class MdMwmType {
    private String id;

    private String code;

    private String name;

    private String memo;

    private String color;

    private String icon1;

    private String icon2;

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

    public MdMwmType(String id, String code, String name, String memo, String color, String icon1, String icon2, String phoneticCode, String fiveStrokeCode, String customizeCode, String createdBy, String createdByName, Date createdAt, String updatedBy, String updatedByName, Date updatedAt, Integer dataVersion, String deletedStatus, Date deletedAt) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.memo = memo;
        this.color = color;
        this.icon1 = icon1;
        this.icon2 = icon2;
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

    public MdMwmType() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color == null ? null : color.trim();
    }

    public String getIcon1() {
        return icon1;
    }

    public void setIcon1(String icon1) {
        this.icon1 = icon1 == null ? null : icon1.trim();
    }

    public String getIcon2() {
        return icon2;
    }

    public void setIcon2(String icon2) {
        this.icon2 = icon2 == null ? null : icon2.trim();
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