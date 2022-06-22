package com.zaun.settings;

import java.io.Serializable;

public class Settings implements Serializable {

    private String IP = "";
    private int sizeWindowProccent = 60;

    public Settings(){

    }

    public String getIP() {
        return IP;
    }
    public int getSizeWindowProccent() {
        return sizeWindowProccent;
    }

    public void setIP(String IP) {
        this.IP = IP;
        FileWriter.write();
    }
    public void setSizeWindowProccent(int sizeWindowProccent) {
        this.sizeWindowProccent = sizeWindowProccent;
        FileWriter.write();
    }
}