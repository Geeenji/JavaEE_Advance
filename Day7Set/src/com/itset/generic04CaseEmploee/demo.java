package com.itset.generic04CaseEmploee;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class demo {
    public static void main(String[] args) {
        List<Teacher> teacherList=new ArrayList<Teacher>();
        Teacher t1=new Teacher();
        t1.setName("lisa");
        t1.setAge(22);

        List<Master> masterList=new ArrayList<Master>();
        Master m1=new Master();
        m1.setName("rose");
        m1.setAge(21);
    }
    //遍历要求不让强转
    public static void iteratorE(List<? extends Employee> list){
        Iterator<? extends Employee> it=list.iterator();
        while (it.hasNext()){
            Employee employee=it.next();
            System.out.println(employee.getName()+employee.getAge());
        }
    }
}
