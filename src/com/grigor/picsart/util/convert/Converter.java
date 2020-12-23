package com.grigor.picsart.util.convert;

import com.grigor.picsart.model.electronic.phone.MobilePhone;
import com.grigor.picsart.model.electronic.tv.SmartTV;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import static com.grigor.picsart.util.Constants.COMMA;

public class Converter {

    public static MobilePhone convertToMobilePhone(String data) {

        MobilePhone mobilePhone = new MobilePhone();
        String[] fileData = data.split(COMMA);

        mobilePhone.setBrand(fileData[0]);
        mobilePhone.setModel(fileData[1]);
        mobilePhone.setSerialNumber(fileData[2]);
        mobilePhone.setReleaseYear(Integer.parseInt(fileData[3]));
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
        smartTV.setReleaseYear(Integer.parseInt(tvData[3]));
        smartTV.setWeight(Integer.parseInt(tvData[4]));
        smartTV.setDisplayType(tvData[5]);
        smartTV.setResponseTime(Integer.parseInt(tvData[6]));
        smartTV.setScreenDiagonal(Integer.parseInt(tvData[7]));
        smartTV.setMatrixType(tvData[8]);
        smartTV.setOperatingSystem(tvData[9]);
        smartTV.setHasWiFi(Boolean.parseBoolean(tvData[10]));
        smartTV.setHasBluetooth(Boolean.parseBoolean(tvData[11]));

        return smartTV;
    }

    // hash password to MD5
    public static String md5(String s) {
        try {
            MessageDigest m = MessageDigest.getInstance("MD5");
            m.update(s.getBytes(), 0, s.length());
            BigInteger i = new BigInteger(1, m.digest());
            return String.format("%1$032x", i);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;
    }

}
