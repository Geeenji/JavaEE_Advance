package com.itIo.iobufferedstream01;

import java.io.*;

public class Dmeo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("E:\\PYTHOOOOON\\Data_Statist\\lesson_02\\lesson_02\\DataStructure_zhejiang\\readFile.txt");
        BufferedInputStream bis=new BufferedInputStream(fis);
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("E:\\a.txt"));
        int len=0;
        byte[] bytes=new byte[1024];
        while((len=bis.read(bytes))!=-1){
            bos.write(bytes,0,len);
        }
        bis.close();
        bos.close();
    }
}
