package com.grigor.picsart.model.electronic.tv;

import com.grigor.picsart.model.electronic.ElectronicItem;

public abstract class TV extends ElectronicItem {
    private String displayType;
    private int responseTime;
    private int screenDiagonal;
    private String matrixType;


    public abstract void showTvProgram();

    @Override
    public void turnOn() {
        System.out.println("TV is on");
    }

    @Override
    public void turnOff() {
        System.out.println("Tv off");
    }

    public String getDisplayType() {
        return displayType;
    }

    public void setDisplayType(String displayType) {
        this.displayType = displayType;
    }

    public int getResponseTime() {
        return responseTime;
    }

    public void setResponseTime(int responseTime) {
        this.responseTime = responseTime;
    }

    public int getScreenDiagonal() {
        return screenDiagonal;
    }

    public void setScreenDiagonal(int screenDiagonal) {
        this.screenDiagonal = screenDiagonal;
    }

    public String getMatrixType() {
        return matrixType;
    }

    public void setMatrixType(String matrixType) {
        this.matrixType = matrixType;
    }

    @Override
    public String toString() {
        return super.toString() + " kg." + "\n Display: " + displayType + "\n Response time: " + responseTime + "hz"
                + "\n Screen Diagonal: " + screenDiagonal + " inch" + "\n Matrix type: " + matrixType;
    }
}
