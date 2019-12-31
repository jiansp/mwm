package com.anxhit.mwm.model;

public class MwmWasteRoomDept {
    private String id;

    private String mwmId;

    public MwmWasteRoomDept(String id, String mwmId) {
        this.id = id;
        this.mwmId = mwmId;
    }

    public MwmWasteRoomDept() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getMwmId() {
        return mwmId;
    }

    public void setMwmId(String mwmId) {
        this.mwmId = mwmId == null ? null : mwmId.trim();
    }
}