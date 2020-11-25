package com.grigor.picsart.util;

import com.grigor.picsart.model.electronic.phone.MobilePhone;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class Converter {

    public static MobilePhone convertToMobilePhone(String data) {
        String[] fileData = data.split(",");
        String brand = fileData[0];
        String model = fileData[1];
        String serialNumber = fileData[2];
        int produceYear = Integer.parseInt(fileData[3]);
        int weight = Integer.parseInt(fileData[4]);
        String operatingSystem = fileData[5];
        int batteryCapacity = Integer.parseInt(fileData[6]);
        String display = fileData[7];
        String networkType = fileData[8];
        boolean isDualSim = Boolean.parseBoolean(fileData[9]);
        boolean isTouchScreen = Boolean.parseBoolean(fileData[10]);
        boolean isMemoryCardSlot = Boolean.parseBoolean(fileData[11]);
        boolean isMainCamera = Boolean.parseBoolean(fileData[12]);
        boolean isSelfieCamera = Boolean.parseBoolean(fileData[13]);
        boolean bluetooth = Boolean.parseBoolean(fileData[14]);
        int memory = Integer.parseInt(fileData[15]);
        return new MobilePhone(brand, model, serialNumber, produceYear, weight, operatingSystem, batteryCapacity,
                display, networkType, isDualSim, isTouchScreen, isMemoryCardSlot, isMainCamera, isSelfieCamera, bluetooth, memory);
    }

    public static void convertMobilePhoneToFile(List<MobilePhone> mobilePhones, String path, boolean append) throws IOException {
        for (MobilePhone mobilePhone : mobilePhones) {
            String outputText =
                    mobilePhone.getBrand() + "," + mobilePhone.getModel() + ","
                            + mobilePhone.getSerialNumber() + "," + mobilePhone.getProduceYear() + ","
                            + mobilePhone.getWeight() + "," + mobilePhone.getOperatingSystem() + ","
                            + mobilePhone.getBatteryCapacity() + "," + mobilePhone.getDisplay() + ","
                            + mobilePhone.getNetworkType() + "," + mobilePhone.isDualSim() + ","
                            + mobilePhone.isTouchScreen() + "," + mobilePhone.isMemoryCardSlot() + ","
                            + mobilePhone.isMainCamera() + "," + mobilePhone.isSelfieCamera() + ","
                            + mobilePhone.isBluetooth() + "," + mobilePhone.getMemory() + "\n";
            saveToFile(path, outputText, append);
        }
    }

    private static void saveToFile(String path, String text, boolean append) throws IOException {
        FileWriter fileWriter = new FileWriter(path, append);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.println(text);
        printWriter.close();
    }
}
