package com.itfei.file03;
//递归遍历文件目录带文件过滤器
import java.io.File;
import java.io.FileFilter;

public class fileDemo {
    public static void main(String[] args) {
        File file=new File("F:\\IdeaProjects\\Basiccode");
        getALl(file);
    }
    public static void getALl(File dir){
        File[] files=dir.listFiles(new Myjavafilter());
        for (File file:files){
            if(file.isDirectory()){
                getALl(file);
            }else{
                System.out.println(file);
            }
        }

    }
}
class Myjavafilter implements FileFilter{
    public boolean  accept(File pathname){
        //做文件遍历过滤的时候不要拦截文件夹
        if(pathname.isDirectory()) return true;
        return pathname.toString().endsWith(".java");
    }
}
