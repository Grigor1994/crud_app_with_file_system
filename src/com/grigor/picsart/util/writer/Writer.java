package com.grigor.picsart.util.writer;

import com.grigor.picsart.model.user.User;
import com.grigor.picsart.util.Constants;
import com.grigor.picsart.util.convert.Converter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Writer {

    public static void writeToFile(String path, String text, boolean append) throws IOException {
        FileWriter fileWriter = new FileWriter(path, append);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.println(text);
        printWriter.close();
    }

    public static void writeUserToFile(User user) throws IOException {
        String newUser = user.getName() + Constants.COMMA + user.getSurName() +
                Constants.COMMA + user.getUserName() +
                Constants.COMMA + user.getEmail() + Constants.COMMA +
                Converter.md5(user.getPassword()) + "\n";
        Files.write(Paths.get(Constants.FILE_PATH), newUser.getBytes(StandardCharsets.UTF_8), StandardOpenOption.APPEND);
    }
}
