package com.grigor.picsart.service;

import com.grigor.picsart.model.electronic.phone.MobilePhone;

import java.util.Calendar;
import java.util.List;

public class PhoneService {

    private static final int CURRENT_YEAR = Calendar.getInstance().get(Calendar.YEAR);

    public static MobilePhone getNewestPhone(List<MobilePhone> mobilePhones) {
        MobilePhone newestPhone = null;
        int min = (CURRENT_YEAR - mobilePhones.get(0).getReleaseYear());
        for (MobilePhone mobilePhone : mobilePhones) {
            if (min > (CURRENT_YEAR - mobilePhone.getReleaseYear())) {
                min = (CURRENT_YEAR - mobilePhone.getReleaseYear());
                newestPhone = mobilePhone;
            }
        }
        return newestPhone;
    }
}
