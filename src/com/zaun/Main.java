package com.zaun;

import com.zaun.GUI.*;
import com.zaun.connect.*;
import com.zaun.settings.FileReader;
import com.zaun.settings.FileWriter;
import com.zaun.settings.Settings;
import java.util.Objects;

public class Main {

    private static MainGUI win;
    private static ArduinoConnect con;
    private static FileWriter writer;
    private static FileReader reader;
    private static String path = "res\\data\\ArduinoControlPanel.dat";
    private static Settings set;

    public static void main(String[] args)  {
        //init object
        writer = new FileWriter(path);
        reader = new FileReader(path);
        set = new Settings();
        //read ip if file exists
        reader.read();
        //init window

        win = new MainGUI();
        //Get from user ip if ip == ""
        if (Objects.equals(set.getIP().trim(), ""))set.setIP( win.getIpFromUser());
        //Visible window
        win.setVisible(true);
        //create procces pingArduino.bat
        try {
            con = new ArduinoConnect();
        }catch (NullPointerException e){
            System.out.println(e);
        }
    }

    public static MainGUI getWin() {
        return win;
    }
    public static void setSet(Settings set) {
        Main.set = set;
    }
    public static Settings getSet() {
        return set;
    }

}
