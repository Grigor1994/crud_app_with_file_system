package com.grigor.picsart.model.electronic.tv;

public class DigitalTV extends TV {
    public DigitalTV(String brand, String model, String serialNumber, int produceYear, int weight, String display, int responseTime, int screenDiagonal, String matrixType) {
        super(brand, model, serialNumber, produceYear, weight, display, responseTime, screenDiagonal, matrixType);
    }

    @Override
    public void showTvProgram() {
        System.out.println("Show tv program");
    }
}
