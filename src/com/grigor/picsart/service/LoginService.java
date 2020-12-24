package com.grigor.picsart.service;

import com.grigor.picsart.dao.UserDao;
import com.grigor.picsart.model.credential.Credentials;
import com.grigor.picsart.model.user.User;
import com.grigor.picsart.util.convert.Converter;

import java.io.IOException;

public class LoginService {

    public static boolean login(Credentials credentials) {
        return loginValidation(credentials.getLogin(), credentials.getPassword());
    }

    private static boolean loginValidation(String userName, String password) {
        try {
            for (User user : UserDao.getUsers()) {
                if (user.getUserName().equalsIgnoreCase(userName) && user.getPassword().equals(Converter.md5(password))) {
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}
