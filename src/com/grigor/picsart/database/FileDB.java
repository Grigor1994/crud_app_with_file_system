package com.grigor.picsart.database;

import com.grigor.picsart.exception.EntityException;
import com.grigor.picsart.model.StringRepresentableObject;
import com.grigor.picsart.util.Constants;
import com.grigor.picsart.util.reader.Reader;
import com.grigor.picsart.util.writer.Writer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class FileDB {

    public static void writeToFile(StringRepresentableObject object, String path) {
        String result = String.join(Constants.COMMA, object.fieldsAsString());
        try {
            Writer.writeToFile(path, result, true);
        } catch (IOException e) {
            throw new EntityException(e);
        }
    }

    public static List<String[]> readAll(String path) {
        Reader reader;
        try {
            reader = new Reader(path);
            List<String> rows = reader.readAllData();

            return rows.stream().map(s -> s.split(Constants.COMMA)).collect(Collectors.toList());
        } catch (FileNotFoundException e) {
            throw new EntityException(e);
        }
    }
}
