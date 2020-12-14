package com.itweb.BrowserServer;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
//edge可以，chrome不可以
public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket=new ServerSocket(8888);

        while (true){
            Socket socket = serverSocket.accept();//客户端使用浏览器连接
            InetAddress inetAddress=socket.getInetAddress();
            //获取客户端的主机名字，和IO地址
            System.out.println(inetAddress.getHostName());
            new Thread(new MyRunnable(socket)).start();
        }
//        serverSocket.close();
    }
}
