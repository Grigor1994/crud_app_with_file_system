package com.grigor.picsart.database.dao;

import com.grigor.picsart.database.FileDB;
import com.grigor.picsart.model.electronic.laptop.Laptop;
import com.grigor.picsart.util.convert.Converter;

import java.util.List;
import java.util.stream.Collectors;

public class LaptopDao {
    private static final String FILE_PATH = "laptop.txt";

    public static void addLaptop(Laptop laptop) {
        FileDB.writeToFile(laptop, FILE_PATH);
    }

    public static List<Laptop> getLaptopList() {
        List<String[]> rows = FileDB.readAll(FILE_PATH);
        return rows.stream().map(Converter::convertToLaptop).collect(Collectors.toList());
    }
}
