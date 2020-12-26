package com.grigor.picsart.model.electronic.phone;

public class MobilePhone extends Phone {

    private String operatingSystem;
    private int batteryCapacity;
    private String displayType;
    private String networkType;
    private boolean isDualSim;
    private boolean hasTouchScreen;
    private boolean hasMemoryCardSlot;
    private boolean hasMainCamera;
    private boolean hasSelfieCamera;
    private boolean bluetooth;
    private int memory;

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

    public void setHasTouchScreen(boolean hasTouchScreen) {
        this.hasTouchScreen = hasTouchScreen;
    }

    public void setHasMemoryCardSlot(boolean hasMemoryCardSlot) {
        this.hasMemoryCardSlot = hasMemoryCardSlot;
    }

    public void setHasMainCamera(boolean hasMainCamera) {
        this.hasMainCamera = hasMainCamera;
    }

    public void setHasSelfieCamera(boolean hasSelfieCamera) {
        this.hasSelfieCamera = hasSelfieCamera;
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

    public boolean isHasTouchScreen() {
        return hasTouchScreen;
    }

    public boolean isHasMemoryCardSlot() {
        return hasMemoryCardSlot;
    }

    public boolean isHasMainCamera() {
        return hasMainCamera;
    }

    public boolean isHasSelfieCamera() {
        return hasSelfieCamera;
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
                ", isTouchScreen=" + hasTouchScreen + "\n" +
                ", isMemoryCardSlot=" + hasMemoryCardSlot + "\n" +
                ", isMainCamera=" + hasMainCamera + "\n" +
                ", isSelfieCamera=" + hasSelfieCamera + "\n" +
                ", bluetooth=" + bluetooth + "\n" +
                ", memory=" + memory + "mb"
                + "\n--------------------------------------";
    }
}