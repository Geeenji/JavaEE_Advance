package com.itproperties.streamLine;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class streamdemo {
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        list.add("abc");
        list.add("jenny");
        list.add("nancy");
        //集合方法，获取Stream流对象
        Stream<String> listStream=list.stream();
        //void accept(T t)
        //stream操作的集合泛型是String
        //变量名s代表了集合中的元素,将s传递到accept的方法体
        listStream.forEach(s-> System.out.println(s.length()));
        //.of将多个元素组合成Stream流对象
        Stream<String> lisa = Stream.of("lisa", "rose", "maria");
    }
}
