package com.itfei.iostream01;

import java.io.FileOutputStream;
import java.io.IOException;

public class ioDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("E:/a.txt");

        //对应的是ASCII码
        fos.write(100);
        fos.write(49);
        fos.write(48);
        fos.write(48);


        method2(fos);

        fos.close();//方法结束也会释放
    }
    public static void method2(FileOutputStream f) throws IOException{
        byte[] bytes="abcdefg".getBytes();
        f.write(bytes);
    }
}
