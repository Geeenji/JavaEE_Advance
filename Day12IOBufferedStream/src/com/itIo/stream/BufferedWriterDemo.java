package com.itIo.stream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
    public static void main(String[] args) throws IOException {
        BufferedWriter bfw=new BufferedWriter(new FileWriter("E://a.txt"));
        bfw.write("第一行");
        bfw.newLine();
        bfw.write("第二行");

        bfw.close();

    }
}
