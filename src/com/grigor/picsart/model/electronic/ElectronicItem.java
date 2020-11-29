package com.grigor.picsart.model.electronic;

public abstract class ElectronicItem {

    private String brand;
    private String model;
    private String serialNumber;
    private int produceYear;
    private int weight;

    public abstract void turnOn();

    public abstract void turnOff();

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setProduceYear(int produceYear) {
        this.produceYear = produceYear;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public int getProduceYear() {
        return produceYear;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return
                "\n brand='" + brand + '\'' + "\n" +
                        ", model='" + model + '\'' + "\n" +
                        ", serialNumber='" + serialNumber + '\'' + "\n" +
                        ", produceYear=" + produceYear + "\n" +
                        ", weight=" + weight;
    }
}
