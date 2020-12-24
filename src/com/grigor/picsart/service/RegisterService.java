package com.grigor.picsart.service;

import com.grigor.picsart.dao.UserDao;
import com.grigor.picsart.model.user.User;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegisterService {

    private static final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    private static final Pattern VALID_PASSWORD_REGEX = Pattern.compile("^(?=(?:.*[A-Z].*){2})(?=(?:.*\\d.*){3})[A-Za-z\\d@$!%*#?&]{8,}$");

    private static final Pattern VALID_USERNAME_REGEX = Pattern.compile("^[A-Za-z_][A-Za-z0-9_]{9,29}$");

    public static boolean registerUser(User user) throws IOException {
        if (!userValidation(user)) {
            registerUser(UserService.createUser());
            return false;
        } else {
            UserDao.registerUser(user);
        }
        return true;
    }

    private static boolean userValidation(User user) throws IOException {
        // check user name
        if (user.getUserName().equals("")) {
            System.out.println("Name field cannot be empty");
            return false;
        }
        if (!validUserName(user.getUserName())) {
            System.out.println("Incorrect user name.");
            return false;
        } else if (!checkDuplicates(user.getUserName())) {
            System.out.println("User with this login already exists, please choose another name.");
            return false;
        }
        // check email
        if (!emailValidation(user.getEmail())) {
            System.out.println("Incorrect email address.");
            return false;
        }
        // check password
        if (!passwordValidation(user.getPassword())) {
            System.out.println("Incorrect password.");
            return false;
        }
        return true;
    }

    private static boolean emailValidation(String emailAddress) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailAddress);
        return matcher.find();
    }

    private static boolean passwordValidation(String password) {
        Matcher matcher = VALID_PASSWORD_REGEX.matcher(password);
        return matcher.find();
    }

    private static boolean validUserName(String userName) {
        Matcher matcher = VALID_USERNAME_REGEX.matcher(userName);
        return matcher.find();
    }

    private static boolean checkDuplicates(String userName) throws IOException {
        for (User user : UserDao.getUser()) {
            if (user.getUserName().equalsIgnoreCase(userName)) {
                return false;
            }
        }
        return true;
    }
}
