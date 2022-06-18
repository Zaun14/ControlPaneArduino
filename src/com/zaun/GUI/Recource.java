package com.zaun.GUI;

import java.awt.*;
import java.util.HashMap;

public class Recource {

    private static HashMap  <String , Image> res = new HashMap();

    public Recource(){
        res.put("ICON_DISABLE" , Toolkit.getDefaultToolkit().getImage("res/icon/icon_dontavailable.png"));
        res.put("ICON_ACTIVE" , Toolkit.getDefaultToolkit().getImage("res/icon/icon_available.png"));
    }

    public HashMap<String, Image> getImages() {
        return res;
    }
}