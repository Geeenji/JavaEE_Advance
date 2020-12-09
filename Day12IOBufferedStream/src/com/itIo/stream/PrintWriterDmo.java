package com.itIo.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDmo {
    public static void main(String[] args) throws IOException {
//        method1();
        method2();
    }
    private static void method2() throws IOException{
        FileOutputStream fos=new FileOutputStream("E:\\case1.txt");
        PrintWriter fw=new PrintWriter(fos,true);
        fw.println("this");
        fw.println("is");
        fw.println("PrintWriter");
        fw.close();
    }
    private static void method1() throws FileNotFoundException {
        FileOutputStream fos=new FileOutputStream("E:\\case1.txt");
        //创建打印流对象，构造方法传递字节输出流
        PrintWriter pw=new PrintWriter(fos);
        pw.println(100);
        pw.close();
    }
}
