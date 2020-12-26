package com.grigor.picsart.model.electronic.tv;

import com.grigor.picsart.model.electronic.ElectronicItem;

public class SmartTV extends ElectronicItem {
    private final String displayType;
    private final int responseTime;
    private final int screenDiagonal;
    private final String matrixType;
    private final String operatingSystem;
    private final boolean hasWiFi;
    private final boolean hasBluetooth;

    public SmartTV(Builder builder) {
        super(builder);
        this.displayType = builder.displayType;
        this.responseTime = builder.responseTime;
        this.screenDiagonal = builder.screenDiagonal;
        this.matrixType = builder.matrixType;
        this.operatingSystem = builder.operatingSystem;
        this.hasWiFi = builder.hasWiFi;
        this.hasBluetooth = builder.hasBluetooth;
    }

    public static class Builder extends ElectronicItem.Builder<Builder> {
        private String displayType;
        private int responseTime;
        private int screenDiagonal;
        private String matrixType;
        private String operatingSystem;
        private boolean hasWiFi;
        private boolean hasBluetooth;

        @Override
        public Builder getThis() {
            return this;
        }

        public Builder setDisplayType(String displayType) {
            this.displayType = displayType;
            return this;
        }

        public Builder setResponseTime(int responseTime) {
            this.responseTime = responseTime;
            return this;
        }

        public Builder setScreenDiagonal(int screenDiagonal) {
            this.screenDiagonal = screenDiagonal;
            return this;
        }

        public Builder setMatrixType(String matrixType) {
            this.matrixType = matrixType;
            return this;
        }

        public Builder setOperatingSystem(String operatingSystem) {
            this.operatingSystem = operatingSystem;
            return this;
        }

        public Builder setHasWiFi(boolean hasWiFi) {
            this.hasWiFi = hasWiFi;
            return this;
        }

        public Builder setHasBluetooth(boolean hasBluetooth) {
            this.hasBluetooth = hasBluetooth;
            return this;
        }

        public SmartTV build() {
            return new SmartTV(this);
        }
    }

    public String getDisplayType() {
        return displayType;
    }

    public int getResponseTime() {
        return responseTime;
    }

    public int getScreenDiagonal() {
        return screenDiagonal;
    }

    public String getMatrixType() {
        return matrixType;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public boolean isHasWiFi() {
        return hasWiFi;
    }

    public boolean isHasBluetooth() {
        return hasBluetooth;
    }

    @Override
    public String toString() {
        return super.toString() + " kg." + "\n Display: " + displayType + "\n Response time: " + responseTime + "hz"
                + "\n Screen Diagonal: " + screenDiagonal + " inch" + "\n Matrix type: " + matrixType;
    }
}
