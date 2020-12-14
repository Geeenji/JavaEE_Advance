package com.itweb.BrowserServer;

import java.io.*;
import java.net.Socket;

public class MyRunnable implements Runnable{
    private Socket socket;
    public MyRunnable(Socket socket){
        this.socket=socket;
    }
    public void run(){
        try{
        InputStream in=socket.getInputStream();

        OutputStream os=socket.getOutputStream();
        //告诉浏览器，使用HTTP 200协议
        os.write("HTTP/1.1 200 OK\r\n".getBytes());
        //告诉浏览器，返回的是网页形式文件，不是文本文件
        os.write("Content-Type:text/html\r\n".getBytes());
        os.write("\r\n".getBytes());
        byte[] bytes=new byte[1024];
//        int len=in.read(bytes);
//        System.out.println(new String(bytes,0,len));
        int len=0;
        InputStreamReader isr=new InputStreamReader(in);
        //创建BufferedReader对象，构造方法中，传递isr字符流
        BufferedReader bfr=new BufferedReader(isr);
        String line = bfr.readLine();
        System.out.println(line);
        //分割字符串，切割空格
        String[] strs=line.split(" ");
        //去掉字符串中最开始 /
        String str=strs[1];
        str=str.substring(1);
        //读取路径下的文件
        FileInputStream fis=new FileInputStream(str);
        while((len=fis.read(bytes))!=-1){
            os.write(bytes,0,len);
        }

        os.write("网站正在开发--this is a IdeaWebSite which can not run on chrome".getBytes("gbk"));
        System.out.println("=====");

        os.close();
        fis.close();
        socket.close();}catch (Exception exception){
            exception.printStackTrace();
        }
    }
}
