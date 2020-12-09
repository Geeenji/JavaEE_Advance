package com.itIo.case1文本排序;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//根据编号，给段落排序，文本为case.txt
/*步骤：
* 1.字符输入流，输入文本，行读，每行就是一个段落
* 2.读取到的每个段落存储在集合中
* 3.集合排序：Collections.sort()
* 4.遍历集合，排序后的文本写回文件*/
public class arrangeDmeo {
    public static void main(String[] args) throws IOException {
        //字符输入流，读取文本，readLine
        BufferedReader bfr=new BufferedReader(new FileReader("E:\\case1.txt"));
        //创建List集合，存储读取到的文本内容
        List<String> list=new ArrayList<String>();
        String line=null;
        while((line=bfr.readLine())!=null){
            list.add(line);
        }
        //collections对集合进行排序
        //方法sort传递比较器，比较器是接口的实现类对象Comparator
        Collections.sort(list,new StringSort());

        //字符输出缓冲流
        BufferedWriter bfw=new BufferedWriter(new FileWriter("E:\\b.txt"));
        for (String s:list){
            bfw.write(s);
            bfw.newLine();
            bfw.flush();
        }
        bfw.close();



    }
}
