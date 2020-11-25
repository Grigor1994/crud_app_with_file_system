package com.grigor.picsart.model.electronic;

public abstract class ElectronicItem {
    private final String brand;
    private final String model;
    private final String serialNumber;
    private final int produceYear;
    private final int weight;

    public ElectronicItem(String brand, String model, String serialNumber, int produceYear, int weight) {
        this.brand = brand;
        this.model = model;
        this.serialNumber = serialNumber;
        this.produceYear = produceYear;
        this.weight = weight;
    }

    public abstract void turnOn();

    public abstract void turnOff();

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
                        ", weight=" + weight + "g.";
    }
}
