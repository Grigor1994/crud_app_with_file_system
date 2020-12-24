package com.grigor.picsart.service;

import com.grigor.picsart.dao.UserDao;
import com.grigor.picsart.model.user.User;
import com.grigor.picsart.util.convert.Converter;

import java.io.IOException;
import java.util.Scanner;

public class LoginService {

    public static boolean isLoginSuccessful() throws IOException {
        System.out.println("Input your login and password");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Login -> ");
        String userName = scanner.nextLine();
        System.out.println("Password ->");
        String password = scanner.nextLine();
        return loginValidation(userName, password);
    }

    private static boolean loginValidation(String userName, String password) throws IOException {
        for (User user : UserDao.getUser()) {
            if (user.getUserName().equalsIgnoreCase(userName) && user.getPassword().equals(Converter.md5(password))) {
                return true;
            }
        }
        return false;
    }
}
