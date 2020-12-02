package com.itTeng.PracticeMap;

import java.util.HashMap;
import java.util.Map;

/*Map集合练习：
* 计算字符串中每个字符出现的次数，区分大小写和数字*/
/*1. 字符串分解 String->Char[]
* 2. 遍历：取出单个字符
* 3. 字符作为key，Map中找值*/
public class PraticeDemo {
    public static void main(String[] args) {
        String str="JSFNJKjksdfjlksd24234sdf";
        //创建Map<字符，出现次数>
        Map<Character,Integer> map=new HashMap<Character, Integer>();
        //字符串转成数组
        char[] chs=str.toCharArray();
        //遍历
        for (char ch:chs){
            Integer v=map.get(ch);
            if(v==null){
                map.put(ch,1);
            }else{
                map.put(ch,++v);
            }
        }
        System.out.println(map.toString());
    }
}
