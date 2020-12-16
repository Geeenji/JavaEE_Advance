package com.itclassLoader.Reflect01;

public class Student {
    static{
        System.out.println("静态的代码块");
    }
    private int age;
    private String name;

    public Student() {
    }
    private Student(String name){
        System.out.println("private method");
    }
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public void study(){
        System.out.println("学生在学习");
    }
    public void eat(String s,double d){
        System.out.println("带参数方法"+s+"::"+d);
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
