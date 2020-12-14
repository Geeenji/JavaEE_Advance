package com.itweb.uploadThread;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPClient {
    public static void main(String[] args) throws IOException {
        //1 创建socket
        Socket s=new Socket("localhost",6665);
        //2 自己的流，读取图片
        FileInputStream fis=new FileInputStream("C:\\Users\\主子\\Pictures\\Saved Pictures\\timg.jpg");
        //3 socket获取字节输出流,任何数据写到服务器
        OutputStream os = s.getOutputStream();
        int len=0;
        byte[] bytes=new byte[1024];
        while((len=fis.read(bytes))!=-1){
            os.write(bytes,0,len);
        }
        //告诉服务器发送TCP终止符
        s.shutdownOutput();

        //4 socket对象获取服务器返回的字节输入流
        InputStream is=s.getInputStream();
        len=is.read(bytes);
        System.out.println("服务器提示::"+new String(bytes,0,len));
        //传入的文件需要flush后才更新
        fis.close();
        os.close();
        s.close();
    }
}
