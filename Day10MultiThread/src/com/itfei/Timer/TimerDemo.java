package com.itfei.Timer;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerDemo {
    public static void main(String[] args) {
        Timer timer=new Timer();
//        timer.schedule(new MyTask(),new Date(),3000);
    timer.schedule(new TimerTask() {
        public void run() {
            System.out.println("定时执行");
        }
    },new Date(),3000);
    }
}
//class MyTask extends TimerTask{
//    public void run(){
//        System.out.println("定时执行");
//    }
//}
