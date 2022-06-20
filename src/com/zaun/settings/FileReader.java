package com.zaun.settings;

import com.zaun.Main;

import java.io.*;


public class FileReader {

    private static   String path;

    public FileReader(String path) {
        this.path = path;
    }

    public static Settings read(){
        File file = new File(path);
        //Check existe file. if exists continue work else break function
        if(!file.exists()) return null;
        try {
            ObjectInputStream read = new ObjectInputStream(new FileInputStream(file));
            return ((Settings) read.readObject());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
