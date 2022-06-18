package com.zaun.settings;

import com.zaun.Main;
import java.io.*;

public class FileWriter {

    private static  String path;

    public FileWriter(String path) {
        this.path = path;
    }

    public static void write(){
        try {
            File file = new File(path);
            if (!file.exists())file.createNewFile();
           ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream(file));
           writer.writeObject(Main.getSet());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
