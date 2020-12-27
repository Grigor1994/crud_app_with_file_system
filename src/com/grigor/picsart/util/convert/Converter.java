package com.grigor.picsart.util.convert;

import com.grigor.picsart.model.electronic.laptop.Laptop;
import com.grigor.picsart.model.electronic.phone.MobilePhone;
import com.grigor.picsart.model.electronic.tv.SmartTV;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import static com.grigor.picsart.util.Constants.COMMA;

public class Converter {

    public static MobilePhone convertToMobilePhone(String data) {
        String[] mobileData = data.split(COMMA);

        return new MobilePhone.Builder().setBrand(mobileData[0]).setModel(mobileData[1])
                .setSerialNumber(mobileData[2]).setReleaseYear(Integer.parseInt(mobileData[3]))
                .setWeight(Integer.parseInt(mobileData[4])).setOperatingSystem(mobileData[5])
                .setBatteryCapacity(Integer.parseInt(mobileData[6])).setDisplayType(mobileData[7])
                .setNetworkType(mobileData[8]).setDualSim(Boolean.parseBoolean(mobileData[9]))
                .setHasTouchScreen(Boolean.parseBoolean(mobileData[10])).setHasMemoryCardSlot(Boolean.parseBoolean(mobileData[11]))
                .setHasMainCamera(Boolean.parseBoolean(mobileData[12])).setHasSelfieCamera(Boolean.parseBoolean(mobileData[13]))
                .setBluetooth(Boolean.parseBoolean(mobileData[14])).setMemory(Integer.parseInt(mobileData[15])).build();
    }

    public static SmartTV convertToSmartTv(String data) {
        String[] tvData = data.split(COMMA);

        return new SmartTV.Builder().setBrand(tvData[0]).setModel(tvData[1])
                .setSerialNumber(tvData[2]).setReleaseYear(Integer.parseInt(tvData[3]))
                .setWeight(Integer.parseInt(tvData[4])).setDisplayType(tvData[5])
                .setResponseTime(Integer.parseInt(tvData[6])).setScreenDiagonal((Integer.parseInt(tvData[7])))
                .setMatrixType(tvData[8]).setOperatingSystem(tvData[9]).setHasWiFi(Boolean.parseBoolean(tvData[10]))
                .setHasBluetooth(Boolean.parseBoolean(tvData[11])).build();
    }

    public static Laptop convertToLaptop(String data) {
        String[] laptopData = data.split(COMMA);
        return new Laptop.Builder().setBrand(laptopData[0]).setModel(laptopData[1]).setSerialNumber(laptopData[2])
                .setReleaseYear(Integer.parseInt(laptopData[3])).setWeight(Integer.parseInt(laptopData[4]))
                .setCpu(laptopData[5]).setRam(Integer.parseInt(laptopData[6])).setHdd(Integer.parseInt(laptopData[7]))
                .setHasTouchScreen(Boolean.parseBoolean(laptopData[8])).setScreenDiagonal(Double.parseDouble(laptopData[9]))
                .setScreenTechnology(laptopData[10]).build();
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
