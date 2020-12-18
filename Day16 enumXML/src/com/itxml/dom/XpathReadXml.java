package com.itxml.dom;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

import java.io.InputStream;
import java.util.List;

public class XpathReadXml {
    public static void main(String[] args) throws Exception {
        SAXReader saxReader=new SAXReader();
        InputStream inputStream=
                XpathReadXml.class.getClassLoader().getResourceAsStream("student.xml");
        Document document=saxReader.read(inputStream);
        Element rootElement=document.getRootElement();
        //获取第一个同名的element
        Node n=rootElement.selectSingleNode("//xing");
        //获取begin和end间的文本
        System.out.println(n.getText());

        List<Node> list=rootElement.selectNodes("//name[@id='heima_0002']");
        System.out.println(list.size());


    }
}
