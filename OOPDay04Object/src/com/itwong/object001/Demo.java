package com.itwong.object001;
/*Object类定义方法toString（）
* 返回值是String类型字符串*/
public class Demo {
    public static void main(String[] args) {
        Person person=new Person();
        String str=person.toString();
        System.out.println(str); //com.itwong.object001.Person@6e8dacdf
        System.out.println(person);//默认调用了toString

        String s = person.toString();
        System.out.println(s);


    }
}
