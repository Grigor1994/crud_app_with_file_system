package com.grigor.picsart.util;

import com.grigor.picsart.model.electronic.phone.MobilePhone;
import com.grigor.picsart.model.electronic.tv.SmartTV;

import static com.grigor.picsart.util.ConstantValues.COMMA;

public class Converter {

    public static MobilePhone convertToMobilePhone(String data) {

        MobilePhone mobilePhone = new MobilePhone();
        String[] fileData = data.split(COMMA);

        mobilePhone.setBrand(fileData[0]);
        mobilePhone.setModel(fileData[1]);
        mobilePhone.setSerialNumber(fileData[2]);
        mobilePhone.setProduceYear(Integer.parseInt(fileData[3]));
        mobilePhone.setWeight(Integer.parseInt(fileData[4]));
        mobilePhone.setOperatingSystem(fileData[5]);
        mobilePhone.setBatteryCapacity(Integer.parseInt(fileData[6]));
        mobilePhone.setDisplayType(fileData[7]);
        mobilePhone.setNetworkType(fileData[8]);
        mobilePhone.setDualSim(Boolean.parseBoolean(fileData[9]));
        mobilePhone.setTouchScreen(Boolean.parseBoolean(fileData[10]));
        mobilePhone.setHasMemoryCardSlot(Boolean.parseBoolean(fileData[11]));
        mobilePhone.setHasMainCamera(Boolean.parseBoolean(fileData[12]));
        mobilePhone.setSelfieCamera(Boolean.parseBoolean(fileData[13]));
        mobilePhone.setBluetooth(Boolean.parseBoolean(fileData[14]));
        mobilePhone.setMemory(Integer.parseInt(fileData[15]));
        return mobilePhone;
    }

    public static SmartTV convertToSmartTv(String data) {

        SmartTV smartTV = new SmartTV();
        String[] tvData = data.split(COMMA);

        smartTV.setBrand(tvData[0]);
        smartTV.setModel(tvData[1]);
        smartTV.setSerialNumber(tvData[2]);
        smartTV.setProduceYear(Integer.parseInt(tvData[3]));
        smartTV.setWeight(Integer.parseInt(tvData[4]));
        smartTV.setOperatingSystem(tvData[5]);
        smartTV.setHasWiFi(Boolean.parseBoolean(tvData[6]));
        smartTV.setHasBluetooth(Boolean.parseBoolean(tvData[7]));

        return smartTV;
    }
}
