package com.itwong.Regex;

public class RegexDemo {
    /*检查字符串是否符合qq号标准：
    * 数字，长度6-10
    * 不能0开头*/

    /*手机号标准
    * 11位
    * 1开头
    * 全数字
    * 第二位可以是13578*/
    public static void main(String[] args) {
        String s="729037641";
        String reg="[1-9][0-9]{6,10}";
        boolean b=s.matches(reg);
        System.out.println(b);

        String s2="1386135837";
        String reg2="1[13578][0-9]{9}";
        boolean b2 = s2.matches(reg2);

        String s3="1234@qq.com";
        String reg3="[a-zA-Z0-9]+@[a-z]+\\.[a-z]+";
        boolean b3=s3.matches(reg3);
        System.out.println(b3);


    }
}
