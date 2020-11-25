package com.itwong.static01;

public class Demo {
    public static void main(String[] args) {
        Student stu=new Student();
        stu.name="lisa";
        stu.age=22;

        Student stu2=new Student();
        stu2.name="rose";
        stu2.age=21;
        stu2.school="stanford"; //把所有对象中的也改了，因为共享
        System.out.println(Student.school);//直接类名调用
        System.out.println(stu.name+"..."+stu.school);
    }
}
