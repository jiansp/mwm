package com.anxhit.mwm.model;

public class MwmFaceDataWithBLOBs extends MwmFaceData {
    private String seetaImageData;

    private String seetaPoints;

    public MwmFaceDataWithBLOBs() {
        super();
    }

    public String getSeetaImageData() {
        return seetaImageData;
    }

    public void setSeetaImageData(String seetaImageData) {
        this.seetaImageData = seetaImageData == null ? null : seetaImageData.trim();
    }

    public String getSeetaPoints() {
        return seetaPoints;
    }

    public void setSeetaPoints(String seetaPoints) {
        this.seetaPoints = seetaPoints == null ? null : seetaPoints.trim();
    }
}