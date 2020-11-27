package com.itwong.Exception07;

public class Demo {
    public static void main(String[] args) {
        try{
            int a=getArea(-5);
        }catch(FuShuException ex){
            ex.printStackTrace();
        }
    }
    public static int getArea(int a) throws FuShuException{
        if (a<=0){
            throw new FuShuException("positive num is a must"); //加入breakpoint条件
//            throw new FuShuException();
        }
        return a*a;
    }
}
