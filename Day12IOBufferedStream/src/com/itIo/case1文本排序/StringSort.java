package com.itIo.case1文本排序;

import java.util.Comparator;

public class StringSort implements Comparator<String> {
    public int compare(String o1,String o2){
        /*o2-o1降序
        * o1-o2升序
        * 取出第一个序号*/
        return o1.charAt(0)-o2.charAt(0);
    }
}
