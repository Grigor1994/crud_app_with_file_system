package com.grigor.picsart.model.electronic.phone;

public class SmartPhone extends MobilePhone {

    private boolean hasWiFi;
    private boolean hasGps;
    private boolean hasFingerPrint;
    private boolean hasFaceId;

    public boolean isHasWiFi() {
        return hasWiFi;
    }

    public void setHasWiFi(boolean hasWiFi) {
        this.hasWiFi = hasWiFi;
    }

    public boolean isHasGps() {
        return hasGps;
    }

    public void setHasGps(boolean hasGps) {
        this.hasGps = hasGps;
    }

    public boolean isHasFingerPrint() {
        return hasFingerPrint;
    }

    public void setHasFingerPrint(boolean hasFingerPrint) {
        this.hasFingerPrint = hasFingerPrint;
    }

    public boolean isHasFaceId() {
        return hasFaceId;
    }

    public void setHasFaceId(boolean hasFaceId) {
        this.hasFaceId = hasFaceId;
    }

    public void takePhoto() {
        System.out.println("Take a photo");
    }

    public void shootVideo() {
        System.out.println("Shoot a video");
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "isWiFi=" + hasWiFi +
                ", isGps=" + hasGps +
                ", isFingerPrint=" + hasFingerPrint +
                ", isFaceId=" + hasFaceId +
                "} " + super.toString();
    }
}
