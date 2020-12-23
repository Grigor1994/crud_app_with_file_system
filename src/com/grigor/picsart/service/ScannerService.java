package com.grigor.picsart.service;

import com.grigor.picsart.model.electronic.phone.MobilePhone;
import com.grigor.picsart.model.electronic.tv.SmartTV;

import java.util.Scanner;

public class ScannerService {

    public static SmartTV createSmartTv() {
        Scanner scanner = new Scanner(System.in);
        SmartTV smartTV = new SmartTV();
        System.out.println("Input Tv brand: ");
        smartTV.setBrand(scanner.nextLine());
        System.out.println("Input Tv model: ");
        smartTV.setModel(scanner.nextLine());
        System.out.println("Input serial number: ");
        smartTV.setSerialNumber(scanner.nextLine());
        System.out.println("Input produce year: ");
        smartTV.setReleaseYear(scanner.nextInt());
        System.out.println("Input Tv weight");
        smartTV.setWeight(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Input display type");
        smartTV.setDisplayType(scanner.nextLine());
        System.out.println("Input response time `Integer`");
        smartTV.setResponseTime(scanner.nextInt());
        System.out.println("Input screen diagonal size ");
        smartTV.setScreenDiagonal(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Input matrix type");
        smartTV.setMatrixType(scanner.nextLine());
        System.out.println("Input operating system");
        smartTV.setOperatingSystem(scanner.nextLine());
        System.out.println("Is WiFi..? Input please `true` or `false`");
        smartTV.setHasWiFi(scanner.nextBoolean());
        System.out.println("Is bluetooth..? Input please `true` or `false`");
        smartTV.setHasBluetooth(scanner.nextBoolean());

        return smartTV;
    }

    public static MobilePhone createMobilePhone() {

        Scanner scanner= new Scanner(System.in);
        MobilePhone mobilePhone = new MobilePhone();

        System.out.println("Input phone brand: ");
        mobilePhone.setBrand(scanner.nextLine());
        System.out.println("Input model: ");
        mobilePhone.setModel(scanner.nextLine());
        System.out.println("Input serial number: ");
        mobilePhone.setSerialNumber(scanner.nextLine());
        System.out.println("Input produce year: ");
        mobilePhone.setReleaseYear(scanner.nextInt());
        System.out.println("Input phone weight: ");
        mobilePhone.setWeight(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Input operating system: ");
        mobilePhone.setOperatingSystem(scanner.nextLine());
        System.out.println("Input battery capacity: ");
        mobilePhone.setBatteryCapacity(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Input display type");
        mobilePhone.setDisplayType(scanner.nextLine());
        System.out.println("Input network type: ");
        mobilePhone.setNetworkType(scanner.nextLine());
        System.out.println("Is dual sim..? Input please `true` or `false`");
        mobilePhone.setDualSim(scanner.nextBoolean());
        System.out.println("Is touch screen..? Input please `true` or `false`");
        mobilePhone.setTouchScreen(scanner.nextBoolean());
        System.out.println("Is memory card slot..? Input please `true` or `false`");
        mobilePhone.setHasMemoryCardSlot(scanner.nextBoolean());
        System.out.println("Is main camera..? Input please `true` or `false`");
        mobilePhone.setHasMainCamera(scanner.nextBoolean());
        System.out.println("Is selfie camera..? Input please `true` or `false`");
        mobilePhone.setSelfieCamera(scanner.nextBoolean());
        System.out.println("Is bluetooth..? Input please `true` or `false`");
        mobilePhone.setBluetooth(scanner.nextBoolean());
        System.out.println("Input memory size: ");
        mobilePhone.setMemory(scanner.nextInt());

        return mobilePhone;
    }

}
