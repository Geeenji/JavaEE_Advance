package com.itclassLoader.Reflect01;
/*反射的关键对象：class文件对象
* 类加载器创建，获取使用
*
* */
public class ReflectDmeo {
    public static void main(String[] args) throws ClassNotFoundException {
        //1 getClass()
        Student student=new Student();
        Class c1=student.getClass();
        System.out.println(c1);

        //2 类的静态属性class获取,由JVM赋予.静态，只运行一次
        Class c2=Student.class;
        System.out.println(c2);

        //3 用Class类静态方法 forname（）
        //注意：类名必须是全限定名reference
        Class c3=Class.forName("com.itclassLoader.Reflect01.Student");
        System.out.println(c3);
    }
}
