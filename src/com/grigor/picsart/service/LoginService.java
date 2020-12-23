package com.grigor.picsart.service;

import com.grigor.picsart.util.Constants;
import com.grigor.picsart.util.convert.Converter;
import com.grigor.picsart.util.reader.Reader;

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
        String[] database = Reader.read(Constants.FILE_PATH);
        return database[2].equalsIgnoreCase(userName) && database[4].equals(Converter.md5(password));
    }
}
