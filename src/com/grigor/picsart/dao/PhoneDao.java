package com.grigor.picsart.dao;

import com.grigor.picsart.model.electronic.phone.MobilePhone;
import com.grigor.picsart.util.convert.Converter;
import com.grigor.picsart.util.reader.Reader;
import com.grigor.picsart.util.writer.Writer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static com.grigor.picsart.util.Constants.COMMA;

public class PhoneDao {
    private static final String FILE_PATH = "phone.txt";

    public static void addMobilePhone(MobilePhone mobilePhone) throws IOException {
        writeMobilePhoneToFile(mobilePhone);
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

    private static void writeMobilePhoneToFile(MobilePhone mobilePhone) throws IOException {
        String outputText =
                mobilePhone.getBrand() + COMMA + mobilePhone.getModel() + COMMA
                        + mobilePhone.getSerialNumber() + COMMA + mobilePhone.getReleaseYear() + COMMA
                        + mobilePhone.getWeight() + COMMA + mobilePhone.getOperatingSystem() + COMMA
                        + mobilePhone.getBatteryCapacity() + COMMA + mobilePhone.getDisplayType() + COMMA
                        + mobilePhone.getNetworkType() + COMMA + mobilePhone.isDualSim() + COMMA
                        + mobilePhone.isHasTouchScreen() + COMMA + mobilePhone.isHasMemoryCardSlot() + COMMA
                        + mobilePhone.isHasMainCamera() + COMMA + mobilePhone.isHasSelfieCamera() + COMMA
                        + mobilePhone.isBluetooth() + COMMA + mobilePhone.getMemory() + "\n";
        Writer.writeToFile(FILE_PATH, outputText, true);
    }
}
