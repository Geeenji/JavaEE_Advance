package com.itweb.tcp02retry;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPserver02 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(6666);
        Socket client=ss.accept();
        InputStream is=client.getInputStream();
        byte[] bytes=new byte[1024];
        int len=is.read(bytes);
        System.out.println(new String(bytes,0,len));
//        while ((len=is.read(bytes))!=-1){
//            System.out.println(new String(bytes,0,len));
//        }

        OutputStream os = client.getOutputStream();
        os.write("服务器收到".getBytes());
        client.close();
        ss.close();
    }
}
