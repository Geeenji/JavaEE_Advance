package com.itproperties.design.decorate;

import java.io.FileReader;
import java.io.IOException;

public class DecorateDemo {
    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("Day13Properties\\config.properties");
        MyBufferedReader mbr=new MyBufferedReader(fr);
        String line=null;
        while((line=mbr.readLine())!=null){
            System.out.println(line);
        }
        mbr.close();
    }
}
