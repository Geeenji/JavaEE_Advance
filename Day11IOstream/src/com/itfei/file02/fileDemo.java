package com.itfei.file02;

import java.io.File;

public class fileDemo {
    public static void main(String[] args) {

    }
    public static void getAll(File dir){
        File[] files=dir.listFiles();
        for (File file:files){
            //判断是不是文件夹
            if (file.isDirectory()){
                //调用自己不断获得文件夹(递归)
                getAll(file);
            }else
                System.out.println(file);
        }
    }
}
