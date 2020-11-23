package com.itheima.oop.extends05CaseMobilePhone;
/*继承和方法重写思想，实现手机案例*/
public class Demo {
    public static void main(String[] args) {
        oldPhone op=new oldPhone();
        op.call();
        op.answer();
        op.sendMessage();

        newPhone np=new newPhone();
        np.answer();
    }
}
