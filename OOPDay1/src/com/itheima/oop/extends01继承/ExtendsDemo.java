package com.itheima.oop.extends01继承;

public class ExtendsDemo {
    public static void main(String[] args) {
        //创建对象，创建Person的子类Teacher
        //子类继承父类，可以使用父类的成员(除private外的)
        Teacher teacher=new Teacher();
        teacher.name="lisa";
        teacher.age=23;

        Student student=new Student();
        student.name="ron";
        student.age=23;
        System.out.println(teacher.name+teacher.age);
    }
}
