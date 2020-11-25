package com.grigor.picsart.model.electronic.tv;

import com.grigor.picsart.model.electronic.ElectronicItem;

public abstract class TV extends ElectronicItem {
    private final String display;
    private final int responseTime;
    private final int screenDiagonal;
    private final String matrixType;

    public TV(String brand, String model, String serialNumber, int produceYear, int weight, String display, int responseTime, int screenDiagonal, String matrixType) {
        super(brand, model, serialNumber, produceYear, weight);
        this.display = display;
        this.responseTime = responseTime;
        this.screenDiagonal = screenDiagonal;
        this.matrixType = matrixType;
    }

    public abstract void showTvProgram();

    @Override
    public void turnOn() {
        System.out.println("TV is on");
    }

    @Override
    public void turnOff() {
        System.out.println("Tv off");
    }

    @Override
    public String toString() {
        return super.toString() + " kg." + "\n Display: " + display + "\n Response time: " + responseTime + "hz"
                + "\n Screen Diagonal: " + screenDiagonal + " inch" + "\n Matrix type: " + matrixType;
    }
}
