package com.zaun.GUI;

import com.zaun.Main;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;

public class Config {

    private static final Dimension SIZE = Toolkit.getDefaultToolkit().getScreenSize(); //Size display
    private static Recource res = new Recource();
    private static JFrame win;

    public Config(JFrame win) {
        Config.win = win;
        init();
        settings();
        setBounds();
    }

    private static void init(){

    }

    private static void settings(){
        //Settings win
        win.setLocationRelativeTo(null);
        win.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        win.setIconImage(res.getImages().get("ICON_DISABLE"));
    }
    private static void setBounds(){
        //Set size window
        win.setSize((int)((double) SIZE.width  / 100d *   (double) Main.getSet().getSizeWindowProccent()) , (int) ((double) SIZE.height / 100d *   (double) Main.getSet().getSizeWindowProccent()));
    }
    public HashMap<String, Image> getImage() {
        return res.getImages();
    }

}
