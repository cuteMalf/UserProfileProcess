package com.malf.upp.utils;

import java.util.ResourceBundle;

public class PropertiesUtil {
    static ResourceBundle resourceBundle = ResourceBundle.getBundle("config");

    public static String getValue(String key){

        return resourceBundle.getString(key);

    }

    public static void main(String[] args) {

        System.out.println(getValue("es.port"));

    }
}
