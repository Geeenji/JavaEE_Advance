package com.itweb.uploadThread;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TCPServer {
    public static void main(String[] args) throws Exception{
        //创建ServerSocket对象，占用port 6665
        ServerSocket ss=new ServerSocket(6665);
        //先创建线程池对象，避免浪费资源
        ExecutorService es= Executors.newFixedThreadPool(10);
        while(true) {
            Socket socket = ss.accept();
            //开线程
//            new Thread(new MyRunnable(socket)).start();
            es.submit(new MyRunnable(socket));
        }

//        ss.close();

    }
}
