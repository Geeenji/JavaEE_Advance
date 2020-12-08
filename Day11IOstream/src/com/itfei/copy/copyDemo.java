package com.itfei.copy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class copyDemo {
    public static void main(String[] args) throws IOException {
        copy();
    }
    private static void copy() throws IOException {
        //输入流对象，绑定数据源
        FileInputStream fis=new FileInputStream("E:\\b.txt");
        //输出流对象，绑定数据目的
        FileOutputStream fos=new FileOutputStream("E:\\a.txt");
        int len=0;
        byte[] bytes=new byte[1024];

        while((len=fis.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }
        fis.close();
        fos.close();
    }
}
