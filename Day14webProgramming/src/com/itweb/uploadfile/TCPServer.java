package com.itweb.uploadfile;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

/*容易出现的bug：
* 1. 多次运行服务器只出现了一个文件：同名覆盖
*   解决：上传的文件，重命名，规则:域名+毫秒值+随机数
* 2. Connection Reset客户端收不到服务器的上传成功信息
* 原因：输入流的方法read*/
public class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(6665);
        Socket socket = ss.accept();
        InputStream is=socket.getInputStream();

        //解决覆盖问题
        String filename="itwtf"+System.currentTimeMillis()+new Random().nextInt(1000)+".jpg";
        FileOutputStream fos=new FileOutputStream("C:\\Users\\主子\\Pictures\\HAPPYcoding\\"+filename);

        int len=0;
        byte[] bytes=new byte[1024];
        while((len=is.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }

        OutputStream os=socket.getOutputStream();
        os.write("服务器已经收到并保存图片".getBytes());

        socket.close();
        ss.close();
    }
}
