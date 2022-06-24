package com.zaun.GUI;

import javax.swing.*;

public class MainGUI extends JFrame {

    private final Config con;
    private static JPanel requestPanel, statusArduino, controlPanel;

    public MainGUI() {
        //Create config
        con = new Config(this);
    }

    //get ip from user use JOptionPane
    public String getIpFromUser() {
        String ip = JOptionPane.showInputDialog(this, "Write IP ESP8266", "IP", JOptionPane.QUESTION_MESSAGE);
        if (ip != null && !ip.equals("")) return ip;
        ip = getIpFromUser();
        return ip;
    }

    public Config getCon() {
        return con;
    }
    public JPanel getRequestPanel() {
        return requestPanel;
    }
    public JPanel getStatusArduino() {
        return statusArduino;
    }
    public JPanel getControlPanel() {
        return controlPanel;
    }
    public void setRequestPanel(JPanel requestPanel) {
        MainGUI.requestPanel = requestPanel;
    }
    public void setStatusArduino(JPanel statusArduino) {
        MainGUI.statusArduino = statusArduino;
    }
    public void setControlPanel(JPanel controlPanel) {
        MainGUI.controlPanel = controlPanel;
    }
}