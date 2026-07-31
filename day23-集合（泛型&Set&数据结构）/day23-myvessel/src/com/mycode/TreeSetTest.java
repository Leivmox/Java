package com.mycode;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<Student2> ts = new TreeSet<>();
//        ts.add(4);
//        ts.add(5);
//        ts.add(2);


//        Iterator<Integer> it = ts.iterator();
//        while (it.hasNext()) {
//            Integer str = it.next();
//            System.out.println(str);
//        }
//        System.out.println("===");
//        for (Integer str2 : ts) {
//            System.out.println(str2);
//        }
//        System.out.println("===");
//
//        ts.forEach(integer -> System.out.println(integer));
        Student2 stu1 = new Student2("zhangsan", 14);
        Student2 stu2 = new Student2("lisi", 15);
        Student2 stu3 = new Student2("wangwu", 16);

        ts.add(stu1);
        ts.add(stu2);
        ts.add(stu3);

        System.out.println(ts);

    }
}
