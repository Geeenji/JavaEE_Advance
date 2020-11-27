package com.itwong.Exception06;

public class Demo {
    public static void main(String[] args) {
        Father f=new Child();
        try {
            f.show();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
