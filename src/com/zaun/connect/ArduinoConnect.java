package com.zaun.connect;

import com.zaun.Main;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArduinoConnect implements ChangeStatusArduino , Runnable {

    private String PATH = "res\\data\\pingArduino.bat";

    public ArduinoConnect(){

    }

    @Override
    public void available() {
        Main.getWin().setIconImage(Main.getWin().getCon().getImage().get("ICON_ACTIVE")) ;
    }
    @Override
    public void dontAvailable() {
        Main.getWin().setIconImage(Main.getWin().getCon().getImage().get("ICON_DISABLE"));
    }

    @Override
    public void run() {
        try {
            Process p = Runtime.getRuntime().exec(new String[]{PATH, Main.getSet().getIP()});
            BufferedReader read = new BufferedReader(new InputStreamReader(p.getInputStream()));
            while (true) {
                String msg = read.readLine();
                if (msg.startsWith("Reply from " + Main.getSet().getIP())) available(); else dontAvailable();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
