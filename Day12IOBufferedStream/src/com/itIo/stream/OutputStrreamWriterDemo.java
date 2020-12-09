package com.itIo.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
//GBK两个字节，UTF三个字节
public class OutputStrreamWriterDemo {
    public static void main(String[] args) {

    }
    public static void writeGBK() throws IOException {
        FileOutputStream fos=new FileOutputStream("e:\\a.txt");
        OutputStreamWriter osw=new OutputStreamWriter(fos);
        osw.write("号");
        osw.close();
    }
}
