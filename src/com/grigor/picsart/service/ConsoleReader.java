package com.grigor.picsart.service;

import com.grigor.picsart.model.credential.Credentials;
import com.grigor.picsart.model.electronic.laptop.Laptop;
import com.grigor.picsart.model.electronic.phone.MobilePhone;
import com.grigor.picsart.model.electronic.tv.SmartTV;
import com.grigor.picsart.model.user.User;

import java.util.Scanner;

public class ConsoleReader {

    public static SmartTV createSmartTv() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input Tv brand: ");
        String brand = scanner.nextLine();
        System.out.println("Input Tv model: ");
        String model = scanner.nextLine();
        System.out.println("Input serial number: ");
        String serialNumber = scanner.nextLine();
        System.out.println("Input release year: ");
        int releaseYear = scanner.nextInt();
        System.out.println("Input Tv weight");
        int weight = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Input display type");
        String displayType = scanner.nextLine();
        System.out.println("Input response time `Integer`");
        int responseTime = scanner.nextInt();
        System.out.println("Input screen diagonal size ");
        int diagonalSize = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Input matrix type");
        String matrixType = scanner.nextLine();
        System.out.println("Input operating system");
        String operatingSystem = scanner.nextLine();
        System.out.println("Is WiFi..? Input please `true` or `false`");
        boolean hasWiFi = scanner.nextBoolean();
        System.out.println("Is bluetooth..? Input please `true` or `false`");
        boolean hasBluetooth = scanner.nextBoolean();

        return new SmartTV.Builder().setBrand(brand).setModel(model)
                .setSerialNumber(serialNumber).setReleaseYear(releaseYear)
                .setWeight(weight).setDisplayType(displayType).setResponseTime(responseTime)
                .setScreenDiagonal(diagonalSize).setMatrixType(matrixType).setOperatingSystem(operatingSystem)
                .setHasWiFi(hasWiFi).setHasBluetooth(hasBluetooth).build();
    }

    public static MobilePhone createMobilePhone() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input phone brand: ");
        String brand = scanner.nextLine();
        System.out.println("Input model: ");
        String model = scanner.nextLine();
        System.out.println("Input serial number: ");
        String serialNumber = scanner.nextLine();
        System.out.println("Input release year: ");
        int releaseYear = scanner.nextInt();
        System.out.println("Input phone weight: ");
        int weight = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Input operating system: ");
        String operatingSystem = scanner.nextLine();
        System.out.println("Input battery capacity: ");
        int batteryCapacity = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Input display type");
        String displayType = scanner.nextLine();
        System.out.println("Input network type: ");
        String networkType = scanner.nextLine();
        System.out.println("Is dual sim..? Input please `true` or `false`");
        boolean isDualSim = scanner.nextBoolean();
        System.out.println("Has touch screen..? Input please `true` or `false`");
        boolean hasTouchScreen = scanner.nextBoolean();
        System.out.println("Has memory card slot..? Input please `true` or `false`");
        boolean hasMemoryCardSlot = scanner.nextBoolean();
        System.out.println("Has main camera..? Input please `true` or `false`");
        boolean hasMainCamera = scanner.nextBoolean();
        System.out.println("Has selfie camera..? Input please `true` or `false`");
        boolean hasSelfieCamera = scanner.nextBoolean();
        System.out.println("Has bluetooth..? Input please `true` or `false`");
        boolean hasBluetooth = scanner.nextBoolean();
        System.out.println("Input memory size: ");
        int memory = scanner.nextInt();

        return new MobilePhone.Builder().setBrand(brand).setModel(model)
                .setSerialNumber(serialNumber).setReleaseYear(releaseYear)
                .setWeight(weight).setOperatingSystem(operatingSystem)
                .setBatteryCapacity(batteryCapacity).setDisplayType(displayType)
                .setNetworkType(networkType).setDualSim(isDualSim)
                .setHasTouchScreen(hasTouchScreen).setHasMemoryCardSlot(hasMemoryCardSlot)
                .setHasMainCamera(hasMainCamera).setHasSelfieCamera(hasSelfieCamera)
                .setBluetooth(hasBluetooth).setMemory(memory).build();
    }

    public static Laptop createLaptop() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input laptop brand: ");
        String brand = scanner.nextLine();
        System.out.println("Input model: ");
        String model = scanner.nextLine();
        System.out.println("Input serial number: ");
        String serialNumber = scanner.nextLine();
        System.out.println("Input release year: ");
        int releaseYear = scanner.nextInt();
        System.out.println("Input laptop weight: ");
        int weight = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Input cpu type: ");
        String cpu = scanner.nextLine();
        System.out.println("Input ram size: ");
        int ram = scanner.nextInt();
        System.out.println("Input memory size: ");
        int hdd = scanner.nextInt();
        System.out.println("Has touch screen.. ? Input please `true` or `false`");
        boolean hasTouchScreen = scanner.nextBoolean();
        System.out.println("Input screen diagonal: `For example -> 15.6`");
        double screenDiagonal = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Input screen technology: ");
        String screenTechnology = scanner.nextLine();

        return new Laptop.Builder().setBrand(brand).setModel(model).setSerialNumber(serialNumber)
                .setReleaseYear(releaseYear).setWeight(weight)
                .setCpu(cpu).setRam(ram).setHdd(hdd)
                .setHasTouchScreen(hasTouchScreen)
                .setScreenDiagonal(screenDiagonal)
                .setScreenTechnology(screenTechnology).build();
    }

    public static User createUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input name ->");
        String name = scanner.nextLine();
        System.out.println("Input surname ->");
        String surName = scanner.nextLine();
        System.out.println("Input user name -> (minimum 10 symbols.)");
        String userName = scanner.nextLine();
        System.out.println("Input email address ->");
        String email = scanner.nextLine();
        System.out.println("Input password -> (password will be minimum 8 symbols and will contain 2 uppercase letter and 3 number.)");
        String password = scanner.nextLine();
        return new User(name, surName, userName, email, password);
    }

    public static Credentials readCredentials() {
        System.out.println("Input your login and password");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Login -> ");
        String userName = scanner.nextLine();
        System.out.println("Password ->");
        String password = scanner.nextLine();
        return new Credentials(userName, password);
    }
}
