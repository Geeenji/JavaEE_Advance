package com.itweb.uploadThread;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Random;

public class MyRunnable implements Runnable{
    private Socket socket;
    public MyRunnable(Socket socket){
        this.socket=socket;
    }
    @Override
    public void run(){
        try {
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
        fos.close();
        socket.close();
            }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
