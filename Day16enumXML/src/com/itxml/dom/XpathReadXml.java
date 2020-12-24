package com.itxml.dom;
//出错了
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
        Node n2=rootElement.selectSingleNode("//student[@number='heima_0002']//age");
        //获取begin和end间的文本
        System.out.println(n.getText());
        System.out.println(n2.getText());
        List<Node> list=rootElement.selectNodes("//name[@id='heima_0002']");
        System.out.println(list.size());


    }
}
