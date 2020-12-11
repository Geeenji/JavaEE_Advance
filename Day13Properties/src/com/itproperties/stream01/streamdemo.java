package com.itproperties.stream01;

import java.util.stream.Stream;

public class streamdemo {
    public static void main(String[] args) {
        Stream<String> stream01=Stream.of("lisa","is");
        Stream<String> stream02=Stream.of("my","wife");
        //Stream接口的静态方法，01和02合并一个流
        Stream<String> stream=Stream.concat(stream01,stream02);

        stream.forEach(s-> System.out.println(s));
    }
}
