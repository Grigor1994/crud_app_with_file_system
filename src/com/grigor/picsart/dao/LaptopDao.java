package com.grigor.picsart.dao;

import com.grigor.picsart.exception.EntityException;
import com.grigor.picsart.model.electronic.laptop.Laptop;
import com.grigor.picsart.model.electronic.phone.MobilePhone;
import com.grigor.picsart.util.convert.Converter;
import com.grigor.picsart.util.reader.Reader;
import com.grigor.picsart.util.writer.Writer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static com.grigor.picsart.util.Constants.COMMA;

public class LaptopDao {
    private static final String FILE_PATH = "laptop.txt";

    public static void addLaptop(Laptop laptop) {
        writeLaptopToFile(laptop);
    }

    public static List<Laptop> getLaptopList() {
        Reader reader;
        try {
            reader = new Reader(FILE_PATH);
        } catch (FileNotFoundException e) {
            throw new EntityException(e);
        }
        List<String> data = reader.readAllData();
        List<Laptop> laptops = new ArrayList<>();
        for (String datum : data) {
            laptops.add(Converter.convertToLaptop(datum));
        }
        return laptops;
    }

    private static void writeLaptopToFile(Laptop laptop) {
        String outputText =
                laptop.getBrand() + COMMA + laptop.getModel() + COMMA + laptop.getSerialNumber() + COMMA
                        + laptop.getReleaseYear() + COMMA + laptop.getWeight() + COMMA + laptop.getCpu()
                        + COMMA + laptop.getRam() + COMMA + laptop.getHdd() + COMMA + laptop.isHasTouchScreen()
                        + COMMA + laptop.getScreenDiagonal() + COMMA + laptop.getScreenTechnology();
        try {
            Writer.writeToFile(FILE_PATH, outputText, true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
