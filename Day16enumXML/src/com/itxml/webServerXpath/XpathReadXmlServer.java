package com.itxml.webServerXpath;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

//把端口号改成活的，读取port文件
public class XpathReadXmlServer{
    public static void main(String[] args) throws Exception{
        InputStream inputStream=
                XpathReadXmlServer.class.getClassLoader().getResourceAsStream("port1.xml");
        SAXReader saxReader=new SAXReader();
        Document document=saxReader.read(inputStream);
        Element rootElement=document.getRootElement();//root!!!
        //xpath get port1
        Node portElement=rootElement.selectSingleNode("//Port");
        //获取标签体
        int port=Integer.parseInt(portElement.getText());
//        System.out.println(port);

        ServerSocket serverSocket=new ServerSocket(port);
        while(true) {
            Socket socket = serverSocket.accept();
            new Thread(new MyRunnable(socket)).start();
        }



    }
}
