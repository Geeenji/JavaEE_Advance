package com.itheima.oop.extends05CaseMobilePhone;

public class newPhone extends oldPhone {
    public void answer(){
        super.answer();
        System.out.println("推销");
        System.out.println("归属地");
    }
}
