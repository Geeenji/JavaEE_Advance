package com.Polymorphism05CasePlayer.test;

import com.Polymorphism05CasePlayer.domain.PingpongCoach;
import com.Polymorphism05CasePlayer.domain.PingpongSport;
import com.Polymorphism05CasePlayer.domain.Sport;
//
public class Demo {
    public static void main(String[] args) {
        //创建乒乓coach和运动员对象
        PingpongSport pps=new PingpongSport();
        pps.setName("lisa");
        pps.setAge(22);
        pps.sport();
        System.out.println(pps.getName()+".."+pps.getAge());

        PingpongCoach ppc=new PingpongCoach();
        ppc.setName("rose");
        ppc.setAge(32);

        pps.learnEnglish();
        ppc.learnEnglish();
    }
}
