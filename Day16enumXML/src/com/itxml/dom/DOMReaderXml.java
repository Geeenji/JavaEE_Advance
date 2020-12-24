package com.itxml.dom;
/*使用DOM思想读取XML
* 介绍dom4j 核心类
* 1. SAXReader DOM解析思想的核心类
*       方法：read(绑定了这个xml文件的输入流) 读取xml文件
*       返回文档Document对象
* 2. Document对象
*       方法：getRootElement()获取文档的根标签
*       返回值，返回的是标签对象 Element
* 3. Element标签对象
*       方法获取子标签 List<> elements()
*       element()获取第一个子标签
*       返回所有的子标签集合List
*       String attributeValue(String attributeName)返回属性值
*       String getText()获取标签体的文本部分
*       */

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.InputStream;
import java.util.List;

public class DOMReaderXml {
    public static void main(String[] args) throws DocumentException {
        //使用类的加载器，获取输入流，绑定xml文件
        InputStream inputStream=
                DOMReaderXml.class.getClassLoader().getResourceAsStream("beans.xml");
//        System.out.println(inputStream);
        //核心类，对象
        SAXReader saxReader=new SAXReader();
        //对象sax的方法read（）传递字节输入流
        Document document=saxReader.read(inputStream);
        //获取根标签
        Element rootElement=document.getRootElement();
        //获取根标签的2个子标签bean
        List<Element> beanElements=rootElement.elements();
        //先对集合进行判断，然后遍历
        if (beanElements!=null&&beanElements.size()>0){
            for (Element element:beanElements){
                String id=element.attributeValue("id");
                String classname=element.attributeValue("classname");
                //获取子element的attributevalue
                List<Element>listElem = element.elements();
                for(Element elem : listElem){
                    String name = elem.attributeValue("name");
                    String value = elem.attributeValue("value");
                    System.out.println(name+""+value);
            }
        }
    }

}}
