package com.grigor.picsart.util;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Writer {

    public static void writeToFile(String path, String text, boolean append) throws IOException {
        FileWriter fileWriter = new FileWriter(path, append);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.println(text);
        printWriter.close();
    }
}
