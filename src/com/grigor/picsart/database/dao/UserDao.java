package com.grigor.picsart.database.dao;

import com.grigor.picsart.database.FileDB;
import com.grigor.picsart.model.user.User;
import com.grigor.picsart.util.convert.Converter;

import java.util.List;
import java.util.stream.Collectors;

public class UserDao {
    private static final String FILE_PATH = "database.txt";

    public static List<User> getUsers() {
        List<String[]> rows = FileDB.readAll(FILE_PATH);
        return rows.stream().map(Converter::convertToUser).collect(Collectors.toList());
    }
    public static void registerUser(User user) {
        FileDB.writeToFile(user, FILE_PATH);
    }
}
