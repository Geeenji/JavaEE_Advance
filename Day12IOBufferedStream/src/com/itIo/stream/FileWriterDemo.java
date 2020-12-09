package com.itIo.stream;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("E:\\a.txt");
        fw.write(97);
        char[] ch="helloWorld".toCharArray();
        fw.write(ch);
        fw.write("腾飞最帅");
        fw.close();
    }
}
