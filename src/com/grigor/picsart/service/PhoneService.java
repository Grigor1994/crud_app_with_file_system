package com.grigor.picsart.service;


import com.grigor.picsart.model.electronic.phone.MobilePhone;
import com.grigor.picsart.util.Converter;
import com.grigor.picsart.util.Reader;
import com.grigor.picsart.util.Writer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static com.grigor.picsart.util.ConstantValues.COMMA;

public class PhoneService {

    private static final String FILE_PATH = "phone.txt";
    private static final int CURRENT_YEAR = 2020;

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
        mobilePhone.setProduceYear(scanner.nextInt());
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

    public static void addMobilePhone(MobilePhone mobilePhone) throws IOException {
        writeMobilePhoneToFile(mobilePhone, FILE_PATH, true);
    }

    public static List<MobilePhone> getPhoneList() throws FileNotFoundException {
        Reader reader = new Reader(FILE_PATH);
        List<String> data = reader.readAllData();
        List<MobilePhone> mobilePhones = new ArrayList<>();
        for (String datum : data) {
            mobilePhones.add(Converter.convertToMobilePhone(datum));
        }
        return mobilePhones;
    }

    public static void writeMobilePhoneToFile(MobilePhone mobilePhone, String path, boolean append) throws IOException {
        String outputText =
                mobilePhone.getBrand() + COMMA + mobilePhone.getModel() + COMMA
                        + mobilePhone.getSerialNumber() + COMMA + mobilePhone.getProduceYear() + COMMA
                        + mobilePhone.getWeight() + COMMA + mobilePhone.getOperatingSystem() + COMMA
                        + mobilePhone.getBatteryCapacity() + COMMA + mobilePhone.getDisplayType() + COMMA
                        + mobilePhone.getNetworkType() + COMMA + mobilePhone.isDualSim() + COMMA
                        + mobilePhone.isTouchScreen() + COMMA + mobilePhone.isHasMemoryCardSlot() + COMMA
                        + mobilePhone.isHasMainCamera() + COMMA + mobilePhone.isSelfieCamera() + COMMA
                        + mobilePhone.isBluetooth() + COMMA + mobilePhone.getMemory() + "\n";
        Writer.writeToFile(path, outputText, append);
    }

    public static void printNewestPhone(List<MobilePhone> mobilePhones) {
        int min = (CURRENT_YEAR - mobilePhones.get(0).getProduceYear());
        for (MobilePhone mobilePhone : mobilePhones) {
            if (min > (CURRENT_YEAR - mobilePhone.getProduceYear())) {
                min = (CURRENT_YEAR - mobilePhone.getProduceYear());
                System.out.print(mobilePhone + " ");
            }
        }
    }
}
