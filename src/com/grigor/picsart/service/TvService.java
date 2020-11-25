package com.grigor.picsart.service;


import com.grigor.picsart.model.electronic.tv.DigitalTV;
import com.grigor.picsart.model.electronic.tv.SmartTV;
import com.grigor.picsart.model.electronic.tv.TV;

public class TvService {
    public static TV createTv(String brand, String model, String serialNumber, int produceYear, int weight, String display, int responseTime, int screenDiagonal, String matrixType) {
        return new DigitalTV(brand, model, serialNumber, produceYear, weight, display, responseTime, screenDiagonal, matrixType);
    }

    public static SmartTV createSmartTv(String brand, String model, String serialNumber, int produceYear, int weight, String display, int responseTime, int screenDiagonal,
                                 String matrixType, String operatingSystem, boolean wiFi, boolean bluetooth) {
        return new SmartTV(brand, model, serialNumber, produceYear, weight, display, responseTime, screenDiagonal, matrixType, operatingSystem, wiFi, bluetooth);
    }
}
