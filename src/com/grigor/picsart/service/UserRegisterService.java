package com.grigor.picsart.service;

import com.grigor.picsart.database.dao.UserDao;
import com.grigor.picsart.exception.ValidationException;
import com.grigor.picsart.model.user.User;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegisterService {

    private static final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    private static final Pattern VALID_PASSWORD_REGEX = Pattern.compile("^(?=(?:.*[A-Z].*){2})(?=(?:.*\\d.*){3})[A-Za-z\\d@$!%*#?&]{8,}$");

    private static final Pattern VALID_USERNAME_REGEX = Pattern.compile("^[A-Za-z0-9_]{9,29}$");

    private static final Pattern VALID_STRING_VALUE_REGEX = Pattern.compile("^[a-zA-Z0-9_ ]*$");

    private static final Pattern VALID_INTEGER_REGEX = Pattern.compile("(\\d+)?");

    private static final Pattern VALID_DOUBLE_REGEX = Pattern.compile("\\d+(\\.\\d+)?");

    public static void registerUser(User user) {
        userValidate(user);
        UserDao.registerUser(user);
    }

    private static void userValidate(User user) {

        if (!checkDuplicates(user.getUserName())) {
            throw new ValidationException("User with this login already exists, please choose another name.");
        }
    }

    public static boolean emailValidate(String emailAddress) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailAddress);
        return matcher.find();
    }

    public static boolean passwordValidate(String password) {
        Matcher matcher = VALID_PASSWORD_REGEX.matcher(password);
        return matcher.find();
    }

    public static boolean userNameValidate(String userName) {
        Matcher matcher = VALID_USERNAME_REGEX.matcher(userName);
        return matcher.find();
    }

    private static boolean checkDuplicates(String userName) {
        for (User user : UserDao.getUsers()) {
            if (user.getUserName().equalsIgnoreCase(userName)) {
                return false;
            }
        }
        return true;
    }

    public static boolean validateAnswer(String value) {
        if (value == null || value.isEmpty()) {
            return false;
        }
        return Arrays.asList("yes", "no").contains(value.toLowerCase());
    }

    public static boolean validateStringValue(String value) {
        if (value == null || value.isEmpty()) {
            return false;
        }
        Matcher matcher = VALID_STRING_VALUE_REGEX.matcher(value);
        return matcher.find();
    }


    public static boolean isNumericDouble(String value) {
        if (value == null || value.isEmpty()) {
            return false;
        }
        return VALID_DOUBLE_REGEX.matcher(value).matches();
    }

    public static boolean isNumericInteger(String value) {
        if (value == null || value.isEmpty()) {
            return false;
        }
        return VALID_INTEGER_REGEX.matcher(value).matches();
    }
}
