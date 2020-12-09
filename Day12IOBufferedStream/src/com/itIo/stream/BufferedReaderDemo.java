package com.itIo.stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {
    public static void main(String[] args) throws IOException {
//        FileReader r = new FileReader("E:\\a.txt");
        BufferedReader bf=new BufferedReader(new FileReader("E:\\a.txt"));
        String line=null;
        while((line=bf.readLine())!=null){
            System.out.println(line);
        }
        bf.close();
    }
}
