package com.itfei.file01;

import java.io.File;

public class listfilesss {
    public static void main(String[] args) {
        File file=new File("G:\\BaiduNetdiskDownload\\2020版本JAVA\\源码文档\\02_JAVA语言进价源码课件\\day11-IO流");
        File[] files= file.listFiles();
        for (File f:files) {
            System.out.println(f);
        }

    }
}
