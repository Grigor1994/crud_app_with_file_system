package com.grigor.picsart.model.electronic.laptop;

import com.grigor.picsart.model.electronic.ElectronicItem;

public class Laptop extends ElectronicItem {
    private final String cpu;
    private final int ram;
    private final int hdd;
    private final boolean hasTouchScreen;
    private final double screenDiagonal;
    private final String screenTechnology;

    public Laptop(Builder builder) {
        super(builder);
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.hdd = builder.hdd;
        this.hasTouchScreen = builder.hasTouchScreen;
        this.screenDiagonal = builder.screenDiagonal;
        this.screenTechnology = builder.screenTechnology;
    }

    public static class Builder extends ElectronicItem.Builder<Builder> {

        private String cpu;
        private int ram;
        private int hdd;
        private boolean hasTouchScreen;
        private double screenDiagonal;
        private String screenTechnology;

        @Override
        public Builder getThis() {
            return this;
        }

        public Builder setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder setRam(int ram) {
            this.ram = ram;
            return this;
        }

        public Builder setHdd(int hdd) {
            this.hdd = hdd;
            return this;
        }

        public Builder setHasTouchScreen(boolean hasTouchScreen) {
            this.hasTouchScreen = hasTouchScreen;
            return this;
        }

        public Builder setScreenDiagonal(double screenDiagonal) {
            this.screenDiagonal = screenDiagonal;
            return this;
        }

        public Builder setScreenTechnology(String screenTechnology) {
            this.screenTechnology = screenTechnology;
            return this;
        }

        public Laptop build() {
            return new Laptop(this);
        }
    }

    public String getCpu() {
        return cpu;
    }

    public int getRam() {
        return ram;
    }

    public int getHdd() {
        return hdd;
    }

    public boolean isHasTouchScreen() {
        return hasTouchScreen;
    }

    public double getScreenDiagonal() {
        return screenDiagonal;
    }

    public String getScreenTechnology() {
        return screenTechnology;
    }

    @Override
    public String toString() {
        return super.toString() +
                ",cpu:'" + cpu + '\'' +
                ", ram:" + ram +"mb"+
                ", hdd:" + hdd +"mb"+
                ", hasTouchScreen:" + hasTouchScreen +
                ", screenDiagonal:" + screenDiagonal +"inch"+
                ", screenTechnology:'" + screenTechnology;
    }
}
