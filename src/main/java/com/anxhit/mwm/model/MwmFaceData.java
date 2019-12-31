package com.anxhit.mwm.model;

public class MwmFaceData {
    private String id;

    private String username;


    public MwmFaceData() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }


}