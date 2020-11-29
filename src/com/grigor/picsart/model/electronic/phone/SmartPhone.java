package com.grigor.picsart.model.electronic.phone;

public class SmartPhone extends MobilePhone {
    private boolean isWiFi;
    private boolean isGps;
    private boolean isFingerPrint;
    private boolean isFaceId;

    public void playMusic() {
        System.out.println("Play music");
    }

    public boolean isWiFi() {
        return isWiFi;
    }

    public void setWiFi(boolean wiFi) {
        isWiFi = wiFi;
    }

    public boolean isGps() {
        return isGps;
    }

    public void setGps(boolean gps) {
        isGps = gps;
    }

    public boolean isFingerPrint() {
        return isFingerPrint;
    }

    public void setFingerPrint(boolean fingerPrint) {
        isFingerPrint = fingerPrint;
    }

    public boolean isFaceId() {
        return isFaceId;
    }

    public void setFaceId(boolean faceId) {
        isFaceId = faceId;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "isWiFi=" + isWiFi +
                ", isGps=" + isGps +
                ", isFingerPrint=" + isFingerPrint +
                ", isFaceId=" + isFaceId +
                "} " + super.toString();
    }
}
