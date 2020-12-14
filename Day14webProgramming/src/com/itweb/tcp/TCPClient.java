package com.itweb.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/*实现TCP的客户端通信
* java.net.Socket实现客户端的套接字对象，连接对象
* 需求：客户端程序和服务器程序实现数据交换
* 步骤：
* 1. 创建Socket对象（主动连接服务器）Socket(String host,int point)
* 2. OutputStream getOutputStream()返回套接字中的字节输出流
*       方法write写入数据，写到服务器
* 3. InputStream getInputStream（）返回套接字中的字节输出流
*       方法read读取服务器中发回来的数据
* 4.释放资源*/
public class TCPClient {
    public static void main(String[] args) throws IOException {
//        Socket socket=new Socket("127.0.0.1",9000);
//        OutputStream outputStream = socket.getOutputStream();
//        outputStream.write("你好服务器".getBytes());//没有写在文件中，写在服务器
//
//        InputStream ips=socket.getInputStream();
//        byte[] bytes=new byte[1024];
//        int len=0;
//        while((len=ips.read(bytes))!=-1){
//            System.out.println(new String(bytes,0,len));
//        }
////        int len=ips.read(bytes);
////        System.out.println(new String(bytes,0,len));
//
//        outputStream.close();
//        ips.close();
//        socket.close();
        System.out.println("客户端 发送数据");
        // 1.创建 Socket ( ip , port ) , 确定连接到哪里.
        Socket client = new Socket("localhost", 9000);
        // 2.通过Scoket,获取输出流对象
        OutputStream os = client.getOutputStream();
        // 3.写出数据.
        os.write("你好么? tcp ,我来了".getBytes());
        // ==============解析回写=========================
        // 4. 通过Scoket,获取 输入流对象
        InputStream in = client.getInputStream();
        // 5. 读取数据数据
        byte[] b = new byte[100];
        int len = in.read(b);
        System.out.println(new String(b, 0, len));
        // 6. 关闭资源 .
        in.close();
        os.close();
        client.close();
    }
}
