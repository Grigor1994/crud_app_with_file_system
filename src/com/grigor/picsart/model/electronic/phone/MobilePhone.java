package com.grigor.picsart.model.electronic.phone;

public class MobilePhone extends Phone {

    private String operatingSystem;
    private int batteryCapacity;
    private String displayType;
    private String networkType;
    private boolean isDualSim;
    private boolean isTouchScreen;
    private boolean hasMemoryCardSlot;
    private boolean hasMainCamera;
    private boolean isSelfieCamera;
    private boolean bluetooth;
    private int memory;

    public void takePhoto() {
        System.out.println("Take a photo");
    }

    public void shootVideo() {
        System.out.println("Shoot a video");
    }

    @Override
    public void call(String name) {

    }

    @Override
    public void hangUp() {

    }

    @Override
    public void turnOn() {

    }

    @Override
    public void turnOff() {

    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public void setDisplayType(String displayType) {
        this.displayType = displayType;
    }

    public void setNetworkType(String networkType) {
        this.networkType = networkType;
    }

    public void setDualSim(boolean dualSim) {
        isDualSim = dualSim;
    }

    public void setTouchScreen(boolean touchScreen) {
        isTouchScreen = touchScreen;
    }

    public void setHasMemoryCardSlot(boolean hasMemoryCardSlot) {
        this.hasMemoryCardSlot = hasMemoryCardSlot;
    }

    public void setHasMainCamera(boolean hasMainCamera) {
        this.hasMainCamera = hasMainCamera;
    }

    public void setSelfieCamera(boolean selfieCamera) {
        isSelfieCamera = selfieCamera;
    }

    public void setBluetooth(boolean bluetooth) {
        this.bluetooth = bluetooth;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public String getDisplayType() {
        return displayType;
    }

    public String getNetworkType() {
        return networkType;
    }

    public boolean isDualSim() {
        return isDualSim;
    }

    public boolean isTouchScreen() {
        return isTouchScreen;
    }

    public boolean isHasMemoryCardSlot() {
        return hasMemoryCardSlot;
    }

    public boolean isHasMainCamera() {
        return hasMainCamera;
    }

    public boolean isSelfieCamera() {
        return isSelfieCamera;
    }

    public boolean isBluetooth() {
        return bluetooth;
    }

    public int getMemory() {
        return memory;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n operatingSystem='" + operatingSystem + '\'' + "\n" +
                ", batteryCapacity=" + batteryCapacity + "mAh" + "\n" +
                ", display='" + displayType + '\'' + "\n" +
                ", networkType='" + networkType + '\'' + "\n" +
                ", isDualSim=" + isDualSim + "\n" +
                ", isTouchScreen=" + isTouchScreen + "\n" +
                ", isMemoryCardSlot=" + hasMemoryCardSlot + "\n" +
                ", isMainCamera=" + hasMainCamera + "\n" +
                ", isSelfieCamera=" + isSelfieCamera + "\n" +
                ", bluetooth=" + bluetooth + "\n" +
                ", memory=" + memory + "mb"
                + "\n--------------------------------------";
    }
}
