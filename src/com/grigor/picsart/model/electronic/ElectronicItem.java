package com.grigor.picsart.model.electronic;

public class ElectronicItem {

    protected final String brand;
    protected final String model;
    protected final String serialNumber;
    protected final int releaseYear;
    protected final int weight;

    public ElectronicItem(Builder<?> builder) {
        this.brand = builder.brand;
        this.model = builder.model;
        this.serialNumber = builder.serialNumber;
        this.releaseYear = builder.releaseYear;
        this.weight = builder.weight;
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

    public int getReleaseYear() {
        return releaseYear;
    }

    public int getWeight() {
        return weight;
    }


    public static abstract class Builder<T extends Builder<T>> {
        private String brand;
        private String model;
        private String serialNumber;
        private int releaseYear;
        private int weight;

        public abstract T getThis();

        public T setBrand(String brand) {
            this.brand = brand;
            return this.getThis();
        }

        public T setModel(String model) {
            this.model = model;
            return this.getThis();
        }

        public T setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this.getThis();
        }

        public T setReleaseYear(int releaseYear) {
            this.releaseYear = releaseYear;
            return this.getThis();
        }

        public T setWeight(int weight) {
            this.weight = weight;
            return this.getThis();
        }

        public ElectronicItem build() {
            return new ElectronicItem(this);
        }
    }

    @Override
    public String toString() {
        return
                "\n brand:'" + brand + '\'' + "\n" +
                        ", model:'" + model + '\'' + "\n" +
                        ", serial number:'" + serialNumber + '\'' + "\n" +
                        ", release year:" + releaseYear + "\n" +
                        ", weight:" + weight;
    }
}