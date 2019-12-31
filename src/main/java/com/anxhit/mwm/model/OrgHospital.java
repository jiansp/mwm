package com.anxhit.mwm.model;

import java.util.Date;

public class OrgHospital {
    private String id;

    private String code;

    private String name;

    private String phoneticCode;

    private String fiveStrokeCode;

    private String customizeCode;

    private String type;

    private String hosLevel;

    private String grade;

    private String enName;

    private String shrotName;

    private String logoPath;

    private String idType;

    private String provinceCode;

    private String provinceName;

    private String cityCode;

    private String cityName;

    private String mobile;

    private String address;

    private String branchType;

    private String status;

    private String orgCode;

    private String orgId;

    private String createdBy;

    private String createdByName;

    private Date createdAt;

    private String updatedBy;

    private String updatedByName;

    private Date updatedAt;

    private Integer dataVersion;

    private String deletedStatus;

    private Date deletedAt;

    public OrgHospital(String id, String code, String name, String phoneticCode, String fiveStrokeCode, String customizeCode, String type, String hosLevel, String grade, String enName, String shrotName, String logoPath, String idType, String provinceCode, String provinceName, String cityCode, String cityName, String mobile, String address, String branchType, String status, String orgCode, String orgId, String createdBy, String createdByName, Date createdAt, String updatedBy, String updatedByName, Date updatedAt, Integer dataVersion, String deletedStatus, Date deletedAt) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.phoneticCode = phoneticCode;
        this.fiveStrokeCode = fiveStrokeCode;
        this.customizeCode = customizeCode;
        this.type = type;
        this.hosLevel = hosLevel;
        this.grade = grade;
        this.enName = enName;
        this.shrotName = shrotName;
        this.logoPath = logoPath;
        this.idType = idType;
        this.provinceCode = provinceCode;
        this.provinceName = provinceName;
        this.cityCode = cityCode;
        this.cityName = cityName;
        this.mobile = mobile;
        this.address = address;
        this.branchType = branchType;
        this.status = status;
        this.orgCode = orgCode;
        this.orgId = orgId;
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

    public OrgHospital() {
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getHosLevel() {
        return hosLevel;
    }

    public void setHosLevel(String hosLevel) {
        this.hosLevel = hosLevel == null ? null : hosLevel.trim();
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
    }

    public String getEnName() {
        return enName;
    }

    public void setEnName(String enName) {
        this.enName = enName == null ? null : enName.trim();
    }

    public String getShrotName() {
        return shrotName;
    }

    public void setShrotName(String shrotName) {
        this.shrotName = shrotName == null ? null : shrotName.trim();
    }

    public String getLogoPath() {
        return logoPath;
    }

    public void setLogoPath(String logoPath) {
        this.logoPath = logoPath == null ? null : logoPath.trim();
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType == null ? null : idType.trim();
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode == null ? null : provinceCode.trim();
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName == null ? null : provinceName.trim();
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode == null ? null : cityCode.trim();
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName == null ? null : cityName.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getBranchType() {
        return branchType;
    }

    public void setBranchType(String branchType) {
        this.branchType = branchType == null ? null : branchType.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode == null ? null : orgCode.trim();
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
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