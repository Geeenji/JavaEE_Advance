package com.itwong.CasePoker;

import java.util.ArrayList;
import java.util.Collections;

/*模拟斗地主案例：练习几何对象的使用
* 功能：
*   准备扑克
*      54张，4个花色各13张，加2王牌
*   洗牌:
*       将集合中的字符串打乱
*   发牌
*   看牌*/
public class Demo {
    public static void main(String[] args) {
        String[] colours= {"♥","♠","♣","♦"};
        String[] numbers={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        ArrayList<String> poker=new ArrayList<String>();
        for (int i = 0; i < colours.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                poker.add(colours[i]+numbers[j]);
            }

        }
        poker.add("RedJoker");
        poker.add("BlackJoker");
        Collections.shuffle(poker);
        System.out.println(poker);

        ArrayList<String> p1=new ArrayList<String>();
        ArrayList<String> p2=new ArrayList<String>();
        ArrayList<String> p3=new ArrayList<String>();
        ArrayList<String> bottom=new ArrayList<String>();
        for (int i = 0; i < poker.size(); i++) {
            if (i>poker.size()-3){
                bottom.add(poker.get(i));
            }
            else if(i%3==0){
                p1.add(poker.get(i));
            }else if(i%3==1){
                p2.add(poker.get(i));
            }else{
                p3.add(poker.get(i));
            }
        }
    }
}
