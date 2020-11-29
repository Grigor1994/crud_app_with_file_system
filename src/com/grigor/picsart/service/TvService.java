package com.grigor.picsart.service;


import com.grigor.picsart.model.electronic.tv.SmartTV;
import com.grigor.picsart.util.Converter;
import com.grigor.picsart.util.Reader;
import com.grigor.picsart.util.Writer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static com.grigor.picsart.util.ConstantValues.COMMA;

public class TvService {
    private static final String PATH = "tv.txt";

    public static SmartTV createSmartTv() {

        Scanner scanner=new Scanner(System.in);
        SmartTV smartTV = new SmartTV();

        System.out.println("Input Tv brand: ");
        smartTV.setBrand(scanner.nextLine());
        System.out.println("Input Tv model: ");
        smartTV.setModel(scanner.nextLine());
        System.out.println("Input serial number: ");
        smartTV.setSerialNumber(scanner.nextLine());
        System.out.println("Input produce year: ");
        smartTV.setProduceYear(scanner.nextInt());
        System.out.println("Input Tv weight");
        smartTV.setWeight(scanner.nextInt());
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

    public static void addSmartTv(SmartTV smartTV) throws IOException {
        writeSmartTvToFile(smartTV, PATH, true);
    }

    public static List<SmartTV> getSmartTvList() throws FileNotFoundException {
        Reader reader = new Reader(PATH);
        List<String> data = reader.readAllData();
        List<SmartTV> smartTVS = new ArrayList<>();
        for (String datum : data) {
            smartTVS.add(Converter.convertToSmartTv(datum));
        }
        return smartTVS;
    }

    public static void writeSmartTvToFile(SmartTV smartTV, String path, boolean append) throws IOException {
        String text = smartTV.getBrand() + COMMA + smartTV.getModel() + COMMA + smartTV.getSerialNumber() + COMMA
                + smartTV.getProduceYear() + COMMA + smartTV.getWeight() + COMMA + smartTV.getDisplayType() + COMMA
                + smartTV.getResponseTime() + COMMA + smartTV.getScreenDiagonal() + COMMA + smartTV.getMatrixType() + COMMA
                + smartTV.getOperatingSystem() + COMMA
                + smartTV.isHasWiFi() + COMMA + smartTV.isHasBluetooth() + "\n";
        Writer.writeToFile(path, text, append);
    }
}
