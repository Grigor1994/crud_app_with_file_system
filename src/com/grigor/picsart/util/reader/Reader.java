package com.grigor.picsart.util.reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reader {
    private final Scanner input;

    public Reader(String path) throws FileNotFoundException {
        this.input = new Scanner(new File(path));
    }

    public List<String> readAllData() {
        List<String> data = new ArrayList<>();
        while (input.hasNext()) {
            data.add(input.nextLine());
        }
        return data;
    }

//    public static List<String> read(String path) throws IOException {
//        return Files.readAllLines(Paths.get("database.txt"));
//    }
}
