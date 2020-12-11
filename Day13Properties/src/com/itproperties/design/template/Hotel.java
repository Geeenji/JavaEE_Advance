package com.itproperties.design.template;

public abstract class Hotel {
    /*饭店类
    * 点菜  不明确过程。。。先不做，等待子类实现
    * 吃菜
    * 结账*/
    public void eat(){
        System.out.println("看菜单");
        //吃菜过程不明确
//        System.out.println("盖饭");
        //父类调用了子类方法
        eatingMethod();
        System.out.println("结账");
    }

    public abstract void eatingMethod();
}
