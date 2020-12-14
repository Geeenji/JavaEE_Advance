package com.itweb.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

//java.net.ServerSocket 实现TCP协议中的服务器套接字对象
/*实现TCP服务器程序步骤：
* 1. 创建ServerSocket对象
* ServerSocket(int Port)  Port端口号
* 2. 等待客户端连接，如果没有客户端连接一直等待
* ServerSocket类方法accept()同意
* 方法accept()的返回值Socket对象（客户端的连接对象，包含客户端的IP）
* 3.Socket对象中获取到字节输出流
* OutputStream getOutputStream()
* 方法write写数据，写到客户端
* 4.Socket对象获取字节输入流
* InputStream getInputStream()
*   方法read读取数据，读取的是客户端发来的数据
* 5.释放资源*/
public class TCPServer {
    public static void main(String[] args) throws IOException {
        System.out.println("服务端启动 , 等待连接 .... ");
        // 1.创建 ServerSocket对象，绑定端口，开始等待连接
        ServerSocket ss = new ServerSocket(9000);
        // 2.接收连接 accept 方法, 返回 socket 对象.
        Socket server = ss.accept();
        // 3.通过socket 获取输入流
        InputStream is = server.getInputStream();
        // 4.一次性读取数据
        // 4.1 创建字节数组
        byte[] b = new byte[1024];
        // 4.2 据读取到字节数组中.
        int len = is.read(b);
        // 4.3 解析数组,打印字符串信息
        String msg = new String(b, 0, len);
        System.out.println(msg);
        // =================回写数据=======================
        // 5. 通过 socket 获取输出流
        OutputStream out = server.getOutputStream();
        // 6. 回写数据
        out.write("我很好,谢谢你".getBytes());
        // 7.关闭资源.
        out.close();
        is.close();
        server.close();
//        //床架ServerSocket对象
//        ServerSocket serverSocket=new ServerSocket(666);
//        //accept（）获取客户端对象
//        Socket accept = serverSocket.accept();
////        System.out.println(accept);
//        //使用客户端连接获取对象，输入流
//        InputStream in=accept.getInputStream();
//        byte[] bytes=new byte[1024];
//        //len返回读取到的字节个数
//        int len=0;
//        System.out.println("长度为"+len);
//        while((len=in.read(bytes))!=-1){
//            System.out.println(new String(bytes,0,len));
//        }
//        //Socket客户端对象，获取字节输出流
//        OutputStream ops=accept.getOutputStream();
//        ops.write("收到!!".getBytes());//服务器输出流，写回客户端
//
//        accept.close();
//        serverSocket.close();
    }
}
