package com.itheima.Polymorphism03;
//猫狗案例
//多态好处：无限拓展子类
//多态弊端：只能调用子类和父类的共有内容，不能调用子类的拓展内容
//接口是额外内容，抽象类是共性内容
public class Demo {
    public static void main(String[] args) {
        Animal an=new Cat();
        an.eat();
        //无法调用function()或mouse()
        if (an instanceof Cat){ //先判断实例类型
            Cat cat = (Cat) an;//类型的强制转换，相下转型
            cat.mouse();
        }
    }

}
