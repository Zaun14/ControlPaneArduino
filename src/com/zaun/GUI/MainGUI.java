package com.zaun.GUI;

import javax.swing.*;

public class MainGUI extends JFrame {

    private Config con;

    public MainGUI(){
        //Create config
        con = new Config();
    }

    public  String getIpFromUser() {
        String ip = JOptionPane.showInputDialog(this, "Write IP ESP8266", "IP", JOptionPane.QUESTION_MESSAGE);
        if (ip != null && ip != "") return ip;
        ip = getIpFromUser();
        return ip;
    }
    public  Config getCon() {
        return con;
    }
}