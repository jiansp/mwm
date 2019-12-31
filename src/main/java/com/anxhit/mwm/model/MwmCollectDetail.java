package com.anxhit.mwm.model;

import java.math.BigDecimal;
import java.util.Date;

public class MwmCollectDetail {
    private String id;

    private String collectId;

    private String bagId;

    private String typeId;

    private String typeCode;

    private String typeName;

    private String readWrByRfid;

    private String wrId;

    private String wrCode;

    private String wrName;

    private String transferUserId;

    private String transferUser;

    private BigDecimal weight;

    private Integer count;

    private String qrCode;

    private String rfid;

    private Date collectTime;

    public MwmCollectDetail(String id, String collectId, String bagId, String typeId, String typeCode, String typeName, String readWrByRfid, String wrId, String wrCode, String wrName, String transferUserId, String transferUser, BigDecimal weight, Integer count, String qrCode, String rfid, Date collectTime) {
        this.id = id;
        this.collectId = collectId;
        this.bagId = bagId;
        this.typeId = typeId;
        this.typeCode = typeCode;
        this.typeName = typeName;
        this.readWrByRfid = readWrByRfid;
        this.wrId = wrId;
        this.wrCode = wrCode;
        this.wrName = wrName;
        this.transferUserId = transferUserId;
        this.transferUser = transferUser;
        this.weight = weight;
        this.count = count;
        this.qrCode = qrCode;
        this.rfid = rfid;
        this.collectTime = collectTime;
    }

    public MwmCollectDetail() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getCollectId() {
        return collectId;
    }

    public void setCollectId(String collectId) {
        this.collectId = collectId == null ? null : collectId.trim();
    }

    public String getBagId() {
        return bagId;
    }

    public void setBagId(String bagId) {
        this.bagId = bagId == null ? null : bagId.trim();
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId == null ? null : typeId.trim();
    }

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode == null ? null : typeCode.trim();
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    public String getReadWrByRfid() {
        return readWrByRfid;
    }

    public void setReadWrByRfid(String readWrByRfid) {
        this.readWrByRfid = readWrByRfid == null ? null : readWrByRfid.trim();
    }

    public String getWrId() {
        return wrId;
    }

    public void setWrId(String wrId) {
        this.wrId = wrId == null ? null : wrId.trim();
    }

    public String getWrCode() {
        return wrCode;
    }

    public void setWrCode(String wrCode) {
        this.wrCode = wrCode == null ? null : wrCode.trim();
    }

    public String getWrName() {
        return wrName;
    }

    public void setWrName(String wrName) {
        this.wrName = wrName == null ? null : wrName.trim();
    }

    public String getTransferUserId() {
        return transferUserId;
    }

    public void setTransferUserId(String transferUserId) {
        this.transferUserId = transferUserId == null ? null : transferUserId.trim();
    }

    public String getTransferUser() {
        return transferUser;
    }

    public void setTransferUser(String transferUser) {
        this.transferUser = transferUser == null ? null : transferUser.trim();
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getQrCode() {
        return qrCode;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode == null ? null : qrCode.trim();
    }

    public String getRfid() {
        return rfid;
    }

    public void setRfid(String rfid) {
        this.rfid = rfid == null ? null : rfid.trim();
    }

    public Date getCollectTime() {
        return collectTime;
    }

    public void setCollectTime(Date collectTime) {
        this.collectTime = collectTime;
    }
}