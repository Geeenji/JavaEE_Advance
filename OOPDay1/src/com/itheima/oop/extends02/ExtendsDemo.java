package com.itheima.oop.extends02;
//已经封装父类
/*继承的好处：减少代码量*/
public class ExtendsDemo {

    public static void main(String[] args) {
        int a=2;
        Teacher teacher=new Teacher();
        teacher.setName("lisa");
        teacher.setAge(22);
        System.out.println(teacher.getName()+teacher.getAge());
        show();
    }
    public static void show(){
        int a =3 ;
        System.out.println(a);
    }
}
