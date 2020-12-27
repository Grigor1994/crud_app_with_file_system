package com.grigor.picsart.database.dao;

import com.grigor.picsart.database.FileDB;
import com.grigor.picsart.model.electronic.phone.MobilePhone;
import com.grigor.picsart.util.convert.Converter;

import java.util.List;
import java.util.stream.Collectors;

public class PhoneDao {
    private static final String FILE_PATH = "phone.txt";

    public static void addMobilePhone(MobilePhone mobilePhone) {
        FileDB.writeToFile(mobilePhone, FILE_PATH);
    }

    public static List<MobilePhone> getPhoneList() {
        List<String[]> rows = FileDB.readAll(FILE_PATH);
        return rows.stream().map(Converter::convertToMobilePhone).collect(Collectors.toList());
    }
}
