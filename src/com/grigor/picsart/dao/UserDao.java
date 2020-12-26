package com.grigor.picsart.dao;

import com.grigor.picsart.exception.EntityException;
import com.grigor.picsart.model.user.User;
import com.grigor.picsart.util.Constants;
import com.grigor.picsart.util.convert.Converter;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private static final String FILE_PATH = "database.txt";

    public static List<User> getUsers() {
        List<String> read;
        try {
            read = Files.readAllLines(Paths.get(FILE_PATH));
        } catch (IOException e) {
            throw new EntityException(e);
        }
        List<User> userList = new ArrayList<>();
        for (String str : read) {
            String[] usersArray = str.split(Constants.COMMA);
            userList.add(new User(usersArray[0], usersArray[1], usersArray[2], usersArray[3], usersArray[4]));
        }
        return userList;
    }

    public static void registerUser(User user) {
        String newUser = user.getName() + Constants.COMMA + user.getSurName() +
                Constants.COMMA + user.getUserName() +
                Constants.COMMA + user.getEmail() + Constants.COMMA +
                Converter.md5(user.getPassword()) + "\n";
        try {
            Files.write(Paths.get(FILE_PATH), newUser.getBytes(StandardCharsets.UTF_8), StandardOpenOption.APPEND);
        } catch (IOException e) {
            throw new EntityException(e);
        }
    }
}
