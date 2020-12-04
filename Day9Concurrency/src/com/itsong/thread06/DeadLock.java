package com.itsong.thread06;

import java.util.concurrent.locks.Lock;

public class DeadLock implements Runnable{
    private boolean flag;

    public DeadLock(boolean flag) {
        this.flag = flag;
    }

    public void run(){
        if(flag){
            synchronized (LockA.lockA){
                System.out.println("if...A");
                synchronized (LockB.lockB){
                    System.out.println("if...B");
                }
            }
        }else {
            synchronized (LockB.lockB){
                System.out.println("if...B");
                synchronized (LockA.lockA){
                    System.out.println("if...A");
                }
            }
        }
    }
}
