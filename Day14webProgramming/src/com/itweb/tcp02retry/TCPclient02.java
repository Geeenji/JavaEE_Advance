package com.itweb.tcp02retry;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPclient02 {
    public static void main(String[] args) throws IOException {
        Socket socket=new Socket("localhost",6666);
        OutputStream os=socket.getOutputStream();
        os.write("你好服务器".getBytes());
        InputStream is = socket.getInputStream();

        byte[] bytes=new byte[1024];
        int len=is.read(bytes);
        System.out.println(new String(bytes,0,len));
        //***不能用-1判断读没读完
//        while((len=is.read(bytes))!=-1){
//            System.out.println(new String(bytes,0,len));
//        }
        is.close();
        os.close();
        socket.close();
    }
}
