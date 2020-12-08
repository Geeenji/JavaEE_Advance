package com.itfei.iostream02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {
        FileInputStream f=new FileInputStream("E:\\b.txt");
//        int len = f.read();
//        System.out.println(len);
//
//        len = f.read();
//        System.out.println(len);
//
//        len = f.read();
//        System.out.println(len);
//
        int len=0;
        while((len=f.read())!=-1){
            System.out.println(len);
        }
        f.close();
    }
}
