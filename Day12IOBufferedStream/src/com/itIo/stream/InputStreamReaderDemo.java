package com.itIo.stream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
//编码不能错，传什么输出什么
public class InputStreamReaderDemo {
    public static void main(String[] args) {

    }
    public static void readUTF() throws IOException {
        FileInputStream fis=new FileInputStream("e:\\a.txt");
        InputStreamReader isr=new InputStreamReader(fis);
        char[] ch=new char[1024];
        int len=0;
        while((len=isr.read(ch))!=-1){
            System.out.println(new String(ch,0,len));
        }
    }
    public static void readGBK() throws IOException{
        //文件中存GBK
        FileInputStream fis=new FileInputStream("E;\\b.txt");
        //指定使用编码表GBK
        InputStreamReader isr=new InputStreamReader(fis,"GBK");
        char[] ch=new char[1024];
        int len=0;
        while((len=isr.read(ch))!=-1){
            System.out.println(new String(ch,0,len));
        }
    }
}
