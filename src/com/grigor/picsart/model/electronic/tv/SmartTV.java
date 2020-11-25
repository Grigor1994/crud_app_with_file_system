package com.grigor.picsart.model.electronic.tv;

public class SmartTV extends TV {
    private final String operatingSystem;
    private final boolean WiFi;
    private final boolean bluetooth;

    public SmartTV(String brand, String model, String serialNumber, int produceYear, int weight, String display, int responseTime, int screenDiagonal, String matrixType, String operatingSystem, boolean wiFi, boolean bluetooth) {
        super(brand, model, serialNumber, produceYear, weight, display, responseTime, screenDiagonal, matrixType);
        this.operatingSystem = operatingSystem;
        WiFi = wiFi;
        this.bluetooth = bluetooth;
    }


    @Override
    public void showTvProgram() {
        System.out.println("Show tv program");
    }

    public void entryToInternet() {
        System.out.println("Entry to Youtube.");
    }

    public void playGame() {
        System.out.println("Playing game.");
    }

    @Override
    public String toString() {
        return super.toString() + "\nOperating system: " + operatingSystem + "\n WiFi: " + WiFi + "\n Bluetooth: " + bluetooth;
    }
}
