package com.itclassLoader.test;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/*反射案例：
* 利用反射技术，创建对象，运行对象的方法
* 配置文件，写的是类的名字和方法名字
* IO读取文件，获取类和方法名*/
public class Test {
    //Test类的加载器，必须先获得这个类的Class类文件
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchMethodException {
        ClassLoader loader = Test.class.getClassLoader();
        InputStream inputStream=loader.getResourceAsStream("config.properties");
        System.out.println(inputStream);
        //把流和集合关联使用
        Properties properties=new Properties();
        properties.load(inputStream);
        //集合方法，获取值
        String className=properties.getProperty("className");
        String methodName=properties.getProperty("methodName");
        inputStream.close();
        //反射，获取这个类的class文件对象
        Class c=Class.forName(className);
        //创建对象
        Object obj=c.newInstance();
        //获取方法
        Method method = c.getMethod(methodName);
        //运行方法
        method.invoke(obj);
    }
}
