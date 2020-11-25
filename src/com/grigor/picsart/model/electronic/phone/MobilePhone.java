package com.grigor.picsart.model.electronic.phone;

public class MobilePhone extends Phone {
    private final String operatingSystem;
    private final int batteryCapacity;
    private final String display;
    private final String networkType;
    private final boolean isDualSim;
    private final boolean isTouchScreen;
    private final boolean isMemoryCardSlot;
    private final boolean isMainCamera;
    private final boolean isSelfieCamera;
    private final boolean bluetooth;
    private final int memory;

    public MobilePhone(String brand, String model, String serialNumber, int produceYear, int weight, String operationSystem,
                       int batteryCapacity, String display, String networkType, boolean isDualSim, boolean isTouchScreen,
                       boolean isMemoryCardSlot, boolean isMainCamera, boolean isSelfieCamera, boolean bluetooth, int memory) {
        super(brand, model, serialNumber, produceYear, weight);
        this.operatingSystem = operationSystem;
        this.batteryCapacity = batteryCapacity;
        this.display = display;
        this.networkType = networkType;
        this.isDualSim = isDualSim;
        this.isTouchScreen = isTouchScreen;
        this.isMemoryCardSlot = isMemoryCardSlot;
        this.isMainCamera = isMainCamera;
        this.isSelfieCamera = isSelfieCamera;
        this.bluetooth = bluetooth;
        this.memory = memory;
    }

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

    @Override
    public String toString() {
        return super.toString() +
                "\n operatingSystem='" + operatingSystem + '\'' + "\n" +
                ", batteryCapacity=" + batteryCapacity +"mAh"+ "\n" +
                ", display='" + display + '\'' + "\n" +
                ", networkType='" + networkType + '\'' + "\n" +
                ", isDualSim=" + isDualSim + "\n" +
                ", isTouchScreen=" + isTouchScreen + "\n" +
                ", isMemoryCardSlot=" + isMemoryCardSlot + "\n" +
                ", isMainCamera=" + isMainCamera + "\n" +
                ", isSelfieCamera=" + isSelfieCamera + "\n" +
                ", bluetooth=" + bluetooth + "\n" +
                ", memory=" + memory + "mb"
                +"\n--------------------------------------";
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public String getDisplay() {
        return display;
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

    public boolean isMemoryCardSlot() {
        return isMemoryCardSlot;
    }

    public boolean isMainCamera() {
        return isMainCamera;
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
}
