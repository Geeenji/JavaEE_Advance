package com.itproperties.properties01;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class propertiesDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("Day13Properties/config.properties");
        Properties properties=new Properties();
        properties.load(fis);
        fis.close();
        System.out.println(properties);

    }
}
