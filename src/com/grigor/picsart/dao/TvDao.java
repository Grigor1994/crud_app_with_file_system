package com.grigor.picsart.dao;

import com.grigor.picsart.model.electronic.tv.SmartTV;
import com.grigor.picsart.util.convert.Converter;
import com.grigor.picsart.util.reader.Reader;
import com.grigor.picsart.util.writer.Writer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static com.grigor.picsart.util.Constants.COMMA;

public class TvDao {
    private static final String FILE_PATH = "tv.txt";

    public static void addSmartTv(SmartTV smartTV) {
        try {
            writeSmartTvToFile(smartTV);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<SmartTV> getSmartTvList() {
        Reader reader = null;
        try {
            reader = new Reader(FILE_PATH);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        assert reader != null;
        List<String> data = reader.readAllData();
        List<SmartTV> smartTVS = new ArrayList<>();
        for (String datum : data) {
            smartTVS.add(Converter.convertToSmartTv(datum));
        }
        return smartTVS;
    }

    public static void writeSmartTvToFile(SmartTV smartTV) throws IOException {
        String text = smartTV.getBrand() + COMMA + smartTV.getModel() + COMMA + smartTV.getSerialNumber() + COMMA
                + smartTV.getReleaseYear() + COMMA + smartTV.getWeight() + COMMA + smartTV.getDisplayType() + COMMA
                + smartTV.getResponseTime() + COMMA + smartTV.getScreenDiagonal() + COMMA + smartTV.getMatrixType() + COMMA
                + smartTV.getOperatingSystem() + COMMA
                + smartTV.isHasWiFi() + COMMA + smartTV.isHasBluetooth() + "\n";
        Writer.writeToFile(FILE_PATH, text, true);
    }
}
