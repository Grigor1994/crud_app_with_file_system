package com.grigor.picsart.service;

import com.grigor.picsart.model.credential.Credentials;
import com.grigor.picsart.model.electronic.laptop.Laptop;
import com.grigor.picsart.model.electronic.phone.MobilePhone;
import com.grigor.picsart.model.electronic.tv.SmartTV;
import com.grigor.picsart.model.user.User;

import java.util.Scanner;
import java.util.function.Predicate;

public class ConsoleReader {

    public static SmartTV createSmartTv() {

        String brand = validateAndGet("tv brand", UserRegisterService::validateStringValue, String.class);
        String model = validateAndGet("tv model", UserRegisterService::validateStringValue, String.class);
        String serialNumber = validateAndGet("serial number", UserRegisterService::validateStringValue, String.class);
        int releaseYear = validateAndGet("release year", UserRegisterService::isNumericInteger, Integer.class);
        int weight = validateAndGet("tv weight", UserRegisterService::isNumericInteger, Integer.class);
        String displayType = validateAndGet("display type", UserRegisterService::validateStringValue, String.class);
        int responseTime = validateAndGet("response time", UserRegisterService::isNumericInteger, Integer.class);
        int diagonalSize = validateAndGet("diagonal size `Integer`", UserRegisterService::isNumericInteger, Integer.class);
        String matrixType = validateAndGet("matrix type", UserRegisterService::validateStringValue, String.class);
        String operatingSystem = validateAndGet("operating system", UserRegisterService::validateStringValue, String.class);
        boolean hasWiFi = validateAndGet("Wi Fi,Input please `true` or `false`", UserRegisterService::validateBooleanValue, Boolean.class);
        boolean hasBluetooth = validateAndGet("Bluetooth,Input please `true` or `false`", UserRegisterService::validateBooleanValue, Boolean.class);

        return new SmartTV.Builder().setBrand(brand).setModel(model)
                .setSerialNumber(serialNumber).setReleaseYear(releaseYear)
                .setWeight(weight).setDisplayType(displayType).setResponseTime(responseTime)
                .setScreenDiagonal(diagonalSize).setMatrixType(matrixType).setOperatingSystem(operatingSystem)
                .setHasWiFi(hasWiFi).setHasBluetooth(hasBluetooth).build();
    }

    public static MobilePhone createMobilePhone() {

        String brand = validateAndGet("phone brand", UserRegisterService::validateStringValue, String.class);
        String model = validateAndGet("phone model", UserRegisterService::validateStringValue, String.class);
        String serialNumber = validateAndGet("serial number", UserRegisterService::validateStringValue, String.class);
        int releaseYear = validateAndGet("release year", UserRegisterService::isNumericInteger, Integer.class);
        int weight = validateAndGet("phone weight", UserRegisterService::isNumericInteger, Integer.class);
        String operatingSystem = validateAndGet("operating system", UserRegisterService::validateStringValue, String.class);
        int batteryCapacity = validateAndGet("battery capacity `Integer`", UserRegisterService::isNumericInteger, Integer.class);
        String displayType = validateAndGet("display type", UserRegisterService::validateStringValue, String.class);
        String networkType = validateAndGet("network type", UserRegisterService::validateStringValue, String.class);
        boolean isDualSim = validateAndGet("dual sim.. Input please `true` or `false`", UserRegisterService::validateBooleanValue, Boolean.class);
        boolean hasTouchScreen = validateAndGet("touch screen.. Input please `true` or `false`", UserRegisterService::validateBooleanValue, Boolean.class);
        boolean hasMemoryCardSlot = validateAndGet("memory card slot.. Input please `true` or `false`", UserRegisterService::validateBooleanValue, Boolean.class);
        boolean hasMainCamera = validateAndGet("main camera.. Input please `true` or `false`", UserRegisterService::validateBooleanValue, Boolean.class);
        boolean hasSelfieCamera = validateAndGet("selfie camera.. Input please `true` or `false`", UserRegisterService::validateBooleanValue, Boolean.class);
        boolean hasBluetooth = validateAndGet("bluetooth.. Input please `true` or `false`", UserRegisterService::validateBooleanValue, Boolean.class);
        int memory = validateAndGet("memory size", UserRegisterService::isNumericInteger, Integer.class);

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

        String brand = validateAndGet("laptop brand", UserRegisterService::validateStringValue, String.class);
        String model = validateAndGet("laptop model", UserRegisterService::validateStringValue, String.class);
        String serialNumber = validateAndGet("serial number", UserRegisterService::validateStringValue, String.class);
        int releaseYear = validateAndGet("release year", UserRegisterService::isNumericInteger, Integer.class);
        int weight = validateAndGet("laptop weight", UserRegisterService::isNumericInteger, Integer.class);
        String cpu = validateAndGet("cpu type", UserRegisterService::validateStringValue, String.class);
        int ram = validateAndGet("ram size", UserRegisterService::isNumericInteger, Integer.class);
        int hdd = validateAndGet("memory size", UserRegisterService::isNumericInteger, Integer.class);
        boolean hasTouchScreen = validateAndGet("touch screen.. Input please `true` or `false`", UserRegisterService::validateBooleanValue, Boolean.class);
        System.out.println("Input screen diagonal: `For example -> 15.6`");
        double screenDiagonal = validateAndGet("screen diagonal: `For example -> 15.6`", UserRegisterService::isNumericDouble, Double.class);
        String screenTechnology = validateAndGet("screen technology", UserRegisterService::validateStringValue, String.class);

        return new Laptop.Builder().setBrand(brand).setModel(model).setSerialNumber(serialNumber)
                .setReleaseYear(releaseYear).setWeight(weight)
                .setCpu(cpu).setRam(ram).setHdd(hdd)
                .setHasTouchScreen(hasTouchScreen)
                .setScreenDiagonal(screenDiagonal)
                .setScreenTechnology(screenTechnology).build();
    }

    public static User createUser() {
        String name = validateAndGet("name", UserRegisterService::validateStringValue, String.class);
        String surName = validateAndGet("surname", UserRegisterService::validateStringValue, String.class);
        String userName = validateAndGet("user name -> (minimum 10 symbols.)", UserRegisterService::userNameValidate, String.class);
        String email = validateAndGet("email address", UserRegisterService::emailValidate, String.class);
        String password = validateAndGet("password -> (password will be minimum 8 symbols and will contain 2 uppercase letter and 3 number.)", UserRegisterService::passwordValidate, String.class);
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

    public static <T> T validateAndGet(String propertyName, Predicate<String> predicate, Class<T> type) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input " + propertyName + ": ");
        String line;
        while (true) {
            line = scanner.nextLine();
            if (predicate.test(line)) {
                break;
            } else {
                System.out.print(propertyName + " is invalid, input again: ");
            }
        }

        if (type == String.class) {
            return type.cast(line);
        }
        if (type == Boolean.class) {
            return type.cast(Boolean.valueOf(line));
        }
        if (type == Integer.class) {
            return type.cast(Integer.valueOf(line));
        }
        if (type == Double.class) {
            return type.cast(Double.valueOf(line));
        }

        throw new IllegalArgumentException("Unsupported class type");
    }
}
