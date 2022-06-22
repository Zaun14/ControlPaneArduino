package com.zaun.connect;

import com.zaun.GUI.MainGUI;
import com.zaun.Main;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArduinoConnect implements ChangeStatusArduino {

    public ArduinoConnect(){
        try {
            Process p = Runtime.getRuntime().exec(new String[]{"pingArduino.bat"  , Main.getSet().getIP()});
            BufferedReader read = new BufferedReader(new InputStreamReader(p.getInputStream()));
            while (true) {
                String msg = read.readLine();
                if (msg.startsWith("Reply from " + Main.getSet().getIP())) available(); else dontAvailable();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void available() {
        Main.getWin().setIconImage(Main.getWin().getCon().getImage().get("ICON_ACTIVE")) ;
    }
    @Override
    public void dontAvailable() {
        Main.getWin().setIconImage(Main.getWin().getCon().getImage().get("ICON_DISABLE"));
    }
}
