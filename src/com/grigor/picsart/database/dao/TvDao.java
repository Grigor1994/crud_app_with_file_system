package com.grigor.picsart.database.dao;

import com.grigor.picsart.database.FileDB;
import com.grigor.picsart.model.electronic.tv.SmartTV;
import com.grigor.picsart.util.convert.Converter;

import java.util.List;
import java.util.stream.Collectors;

public class TvDao {
    private static final String FILE_PATH = "tv.txt";

    public static void addSmartTv(SmartTV smartTV) {
        FileDB.writeToFile(smartTV, FILE_PATH);
    }

    public static List<SmartTV> getSmartTvList() {
        List<String[]> rows = FileDB.readAll(FILE_PATH);
        return rows.stream().map(Converter::convertToSmartTv).collect(Collectors.toList());
    }
}
