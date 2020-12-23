package com.grigor.picsart.model.electronic.tv;

public class SmartTV extends DigitalTV {
    private String operatingSystem;
    private boolean hasWiFi;
    private boolean hasBluetooth;

    public void showTvProgram() {
        System.out.println("Show tv program");
    }

    public void entryToInternet() {
        System.out.println("Entry to Youtube.");
    }

    public void playGame() {
        System.out.println("Playing game.");
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public boolean isHasWiFi() {
        return hasWiFi;
    }

    public void setHasWiFi(boolean hasWiFi) {
        this.hasWiFi = hasWiFi;
    }

    public boolean isHasBluetooth() {
        return hasBluetooth;
    }

    public void setHasBluetooth(boolean hasBluetooth) {
        this.hasBluetooth = hasBluetooth;
    }

    @Override
    public String toString() {
        return super.toString() + "\nOperating system: " + operatingSystem + "\n WiFi: " + hasWiFi + "\n Bluetooth: " + hasBluetooth + "\n";
    }
}
