package com.zaun.GUI;

import com.zaun.Main;
import javax.swing.*;
import java.awt.*;
import java.util.HashMap;

public class Config {

    private static final Dimension SIZE = Toolkit.getDefaultToolkit().getScreenSize(); //Size display
    private static Recource res = new Recource();
    private static MainGUI win;
    private static final int WIDTH_WINDOW = (int)((double) SIZE.width  / 100d *   (double) Main.getSet().getSizeWindowProccent());
    private static final int HEIGHT_WINDOW =  (int) ((double) SIZE.height / 100d *   (double) Main.getSet().getSizeWindowProccent());


    public Config(MainGUI win) {
        Config.win = win;
        init();
        setBounds();
        settings();
    }

    private static void init(){
        win.setControlPanel(new JPanel());
        win.setRequestPanel(new JPanel());
        win.setStatusArduino(new JPanel());
    }

    private static void settings(){
        //Settings win
        win.setLocationRelativeTo(null);
        win.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        win.setIconImage(res.getImages().get("ICON_DISABLE"));
        win.setLayout(new BorderLayout());
        win.setResizable(false);
        //Settings request panel
        win.add(win.getRequestPanel() , BorderLayout.CENTER);
        win.getRequestPanel().setBackground(Color.black);
        //settings statusArduino panel
        win.add(win.getStatusArduino() , BorderLayout.NORTH);
        win.getStatusArduino().setBackground(Color.BLUE);
        //settings controlPanel
        win.add(win.getControlPanel() , BorderLayout.SOUTH);
        win.getControlPanel().setBackground(Color.green);
    }
    private static void setBounds(){
        //Set size window
        win.setSize(WIDTH_WINDOW , HEIGHT_WINDOW);
        //set size request panel
        win.getRequestPanel().setPreferredSize(new Dimension((int) (WIDTH_WINDOW / 100d * 60d), (int) (HEIGHT_WINDOW / 100d * 60d)));
        //set size control panel
        win.getControlPanel().setPreferredSize(new Dimension((int) (WIDTH_WINDOW /100d * 20d), (int) (HEIGHT_WINDOW / 100d * 20d)));
        //set size statusArduino panel
        win.getStatusArduino().setPreferredSize(new Dimension((int) (WIDTH_WINDOW / 100d * 20d), (int) (HEIGHT_WINDOW / 100d * 20d)));

    }
    public HashMap<String, Image> getImage() {
        return res.getImages();
    }

}
