package com.grigor.picsart.service;

import com.grigor.picsart.database.dao.UserDao;
import com.grigor.picsart.model.credential.Credentials;
import com.grigor.picsart.model.user.User;
import com.grigor.picsart.util.convert.Converter;

public class LoginService {

    public static boolean login(Credentials credentials) {
        return loginValidation(credentials.getLogin(), credentials.getPassword());
    }

    private static boolean loginValidation(String userName, String password) {
        for (User user : UserDao.getUsers()) {
            if (user.getUserName().equalsIgnoreCase(userName) && user.getPassword().equals(Converter.md5(password))) {
                return true;
            }
        }
        return false;
    }
}
