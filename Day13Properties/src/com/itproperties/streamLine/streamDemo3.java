package com.itproperties.streamLine;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/*Filter 过滤掉不需要的集合*/
public class streamDemo3 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        list.add("张天师");
        list.add("周芷若");
        list.add("张大枪");
        list.add("张无极");
        list.add("王腾飞");

        Stream<String> stream=list.stream();
        //实现了过滤，但是看不到过滤后的结果
        stream.filter(s->s.startsWith("张")).forEach(s-> System.out.println(s));
    }
}
