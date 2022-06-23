package com.zaun.GUI;

import javax.swing.*;

public class MainGUI extends JFrame {

    private final Config con;

    public MainGUI(){
        //TODO Create GUI.
        //Create config
        con = new Config(this);
    }
    //get ip from user use JOptionPane
    public String getIpFromUser() {
        String ip = JOptionPane.showInputDialog(this, "Write IP ESP8266", "IP", JOptionPane.QUESTION_MESSAGE);
        if (ip != null && !ip.equals("") ) return ip;
        ip = getIpFromUser();
        return ip;
    }

    public  Config getCon() {
        return con;
    }
}