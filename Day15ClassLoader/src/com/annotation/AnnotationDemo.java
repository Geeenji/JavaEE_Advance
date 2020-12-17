package com.annotation;

import org.junit.Test;

import java.lang.reflect.Method;
import java.util.Arrays;

public class AnnotationDemo {
    @Test
    public void test()throws Exception{
        //反射BookShelf
        Class c=Class.forName("com.annotation.BookShelf");
        //反射获取方法sellBook
        Method method=c.getMethod("sellBook");
        System.out.println(method);
        //方法判断是否有注解
        //参数传递注解的class文件对象
        boolean b=method.isAnnotationPresent(Book.class);
        //method对象调用方法，获取直接
        Book book=method.getAnnotation(Book.class);
        //获取出Book注解的属性
        String bookName=book.bookName();
        double price=book.price();
        String[] strings=book.author();

        System.out.println(bookName+price+ Arrays.toString(strings));
    }
}
