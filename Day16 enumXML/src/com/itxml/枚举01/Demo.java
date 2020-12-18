package com.itxml.枚举01;
/*- 格式：`public enmu 枚举名{}`
- 枚举常量定义：
  - 枚举中的常量名字大写，多个常量之间逗号分开，最后一个常量可以写分号，也可以不写。每一个常量，都表示这个类的对象。修饰符为`public static final`。
  - 枚举中有默认的无参数的private修饰的构造方法，如果手写构造方法，也必须是私有修饰的。而且构造方法必须写在常量的后面，这时最后一个常量就必须要写分号。*/
public class Demo {
    public static void main(String[] args) {
        Colors colors=Colors.BLUE;
        System.out.println(colors);
        colors.getName();
    }
}
