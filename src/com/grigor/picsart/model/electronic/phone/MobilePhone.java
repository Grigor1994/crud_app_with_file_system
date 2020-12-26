package com.grigor.picsart.model.electronic.phone;

import com.grigor.picsart.model.electronic.ElectronicItem;

public class MobilePhone extends ElectronicItem {

    private final String operatingSystem;
    private final int batteryCapacity;
    private final String displayType;
    private final String networkType;
    private final boolean isDualSim;
    private final boolean hasTouchScreen;
    private final boolean hasMemoryCardSlot;
    private final boolean hasMainCamera;
    private final boolean hasSelfieCamera;
    private final boolean bluetooth;
    private final int memory;

    public MobilePhone(Builder builder) {
        super(builder);
        this.operatingSystem = builder.operatingSystem;
        this.batteryCapacity = builder.batteryCapacity;
        this.displayType = builder.displayType;
        this.networkType = builder.networkType;
        this.isDualSim = builder.isDualSim;
        this.hasTouchScreen = builder.hasTouchScreen;
        this.hasMemoryCardSlot = builder.hasMemoryCardSlot;
        this.hasMainCamera = builder.hasMainCamera;
        this.hasSelfieCamera = builder.hasSelfieCamera;
        this.bluetooth = builder.bluetooth;
        this.memory = builder.memory;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public String getDisplayType() {
        return displayType;
    }

    public String getNetworkType() {
        return networkType;
    }

    public boolean isDualSim() {
        return isDualSim;
    }

    public boolean isHasTouchScreen() {
        return hasTouchScreen;
    }

    public boolean isHasMemoryCardSlot() {
        return hasMemoryCardSlot;
    }

    public boolean isHasMainCamera() {
        return hasMainCamera;
    }

    public boolean isHasSelfieCamera() {
        return hasSelfieCamera;
    }

    public boolean isBluetooth() {
        return bluetooth;
    }

    public int getMemory() {
        return memory;
    }

    public static class Builder extends ElectronicItem.Builder<Builder> {
        private String operatingSystem;
        private int batteryCapacity;
        private String displayType;
        private String networkType;
        private boolean isDualSim;
        private boolean hasTouchScreen;
        private boolean hasMemoryCardSlot;
        private boolean hasMainCamera;
        private boolean hasSelfieCamera;
        private boolean bluetooth;
        private int memory;


        @Override
        public Builder getThis() {
            return this;
        }

        public Builder setOperatingSystem(String operatingSystem) {
            this.operatingSystem = operatingSystem;
            return this;
        }

        public Builder setBatteryCapacity(int batteryCapacity) {
            this.batteryCapacity = batteryCapacity;
            return this;
        }

        public Builder setDisplayType(String displayType) {
            this.displayType = displayType;
            return this;
        }

        public Builder setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }

        public Builder setDualSim(boolean dualSim) {
            isDualSim = dualSim;
            return this;
        }

        public Builder setHasTouchScreen(boolean hasTouchScreen) {
            this.hasTouchScreen = hasTouchScreen;
            return this;
        }

        public Builder setHasMemoryCardSlot(boolean hasMemoryCardSlot) {
            this.hasMemoryCardSlot = hasMemoryCardSlot;
            return this;
        }

        public Builder setHasMainCamera(boolean hasMainCamera) {
            this.hasMainCamera = hasMainCamera;
            return this;
        }

        public Builder setHasSelfieCamera(boolean hasSelfieCamera) {
            this.hasSelfieCamera = hasSelfieCamera;
            return this;
        }

        public Builder setBluetooth(boolean bluetooth) {
            this.bluetooth = bluetooth;
            return this;
        }

        public Builder setMemory(int memory) {
            this.memory = memory;
            return this;
        }

        public MobilePhone build() {
            return new MobilePhone(this);
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n operatingSystem:'" + operatingSystem + '\'' + "\n" +
                ", batteryCapacity:" + batteryCapacity + "mAh" + "\n" +
                ", display:'" + displayType + '\'' + "\n" +
                ", networkType:'" + networkType + '\'' + "\n" +
                ", isDualSim:" + isDualSim + "\n" +
                ", isTouchScreen:" + hasTouchScreen + "\n" +
                ", isMemoryCardSlot:" + hasMemoryCardSlot + "\n" +
                ", isMainCamera:" + hasMainCamera + "\n" +
                ", isSelfieCamera:" + hasSelfieCamera + "\n" +
                ", bluetooth:" + bluetooth + "\n" +
                ", memory:" + memory + "mb"
                + "\n--------------------------------------";
    }
}