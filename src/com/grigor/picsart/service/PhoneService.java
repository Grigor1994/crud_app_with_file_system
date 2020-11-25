package com.grigor.picsart.service;


import com.grigor.picsart.model.electronic.phone.MobilePhone;
import com.grigor.picsart.model.electronic.phone.SmartPhone;
import com.grigor.picsart.util.Converter;
import com.grigor.picsart.util.Reader;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneService {
    private static final String FILE_PATH = "phone.txt";
    private static final int CURRENT_YEAR = 2020;

    public static SmartPhone createSmartPhone(String brand, String model, String serialNumber, int produceYear, int weight,
                                              String operationSystem, int batteryCapacity, String display, String networkType,
                                              boolean isDualSim, boolean isTouchScreen, boolean isMemoryCardSlot, boolean isMainCamera,
                                              boolean isSelfieCamera, boolean bluetooth, int memory, boolean isWiFi, boolean isGps,
                                              boolean isFingerPrint, boolean isFaceId) {
        return new SmartPhone(brand, model, serialNumber, produceYear, weight, operationSystem, batteryCapacity, display, networkType,
                isDualSim, isTouchScreen, isMemoryCardSlot, isMainCamera, isSelfieCamera, bluetooth, memory, isWiFi, isGps, isFingerPrint, isFaceId);
    }

    public static MobilePhone createMobilePhone() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input phone brand: ");
        String brand = scanner.nextLine();
        System.out.println("Input model: ");
        String model = scanner.nextLine();
        System.out.println("Input serial number: ");
        String serialNumber = scanner.nextLine();
        System.out.println("Input produce year: ");
        int produceYear = scanner.nextInt();
        System.out.println("Input weight: ");
        int weight = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Input operating system: ");
        String operationSystem = scanner.nextLine();
        System.out.println("Input battery capacity: ");
        int batteryCapacity = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Input display type");
        String display = scanner.nextLine();
        System.out.println("Input network type: ");
        String networkType = scanner.nextLine();
        System.out.println("Is dual sim..? Input please `true` or `false`");
        boolean isDualSim = scanner.nextBoolean();
        System.out.println("Is touch screen..? Input please `true` or `false`");
        boolean isTouchScreen = scanner.nextBoolean();
        System.out.println("Is memory card slot..? Input please `true` or `false`");
        boolean isMemoryCardSlot = scanner.nextBoolean();
        System.out.println("Is main camera..? Input please `true` or `false`");
        boolean isMainCamera = scanner.nextBoolean();
        System.out.println("Is selfie camera..? Input please `true` or `false`");
        boolean isSelfieCamera = scanner.nextBoolean();
        System.out.println("Is bluetooth..? Input please `true` or `false`");
        boolean bluetooth = scanner.nextBoolean();
        System.out.println("Input memory size: ");
        int memory = scanner.nextInt();
        return new MobilePhone(brand, model, serialNumber, produceYear, weight, operationSystem, batteryCapacity, display, networkType, isDualSim, isTouchScreen, isMemoryCardSlot, isMainCamera, isSelfieCamera, bluetooth, memory);
    }

    public static void addMobilePhone() throws IOException {
        List<MobilePhone> mobilePhoneList = new ArrayList<>();
        mobilePhoneList.add(PhoneService.createMobilePhone());
        for (MobilePhone mobilePhone : mobilePhoneList) {
            System.out.print(mobilePhone + " ");
        }
        Converter.convertMobilePhoneToFile(mobilePhoneList, FILE_PATH, true);
    }

    public static MobilePhone[] getPhoneList() throws FileNotFoundException {
        Reader reader = new Reader(FILE_PATH);
        List<String> data = reader.readAllData();
        MobilePhone[] mobilePhones = new MobilePhone[data.size()];
        for (int i = 0; i < data.size(); i++) {
            mobilePhones[i] = Converter.convertToMobilePhone(data.get(i));
        }
        return mobilePhones;
    }

    public static void printNewestPhone(MobilePhone[] mobilePhones) {
        int min = (CURRENT_YEAR - mobilePhones[0].getProduceYear());
        for (MobilePhone mobilePhone : mobilePhones) {
            if (min > (CURRENT_YEAR - mobilePhone.getProduceYear())) {
                min = (CURRENT_YEAR - mobilePhone.getProduceYear());
                System.out.print(mobilePhone + " ");
            }
        }
    }
}
