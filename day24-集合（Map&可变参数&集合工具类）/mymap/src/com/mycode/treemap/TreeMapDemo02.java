package com.mycode.treemap;

import com.mycode.myhashmap.Student;

import java.util.TreeMap;

public class TreeMapDemo02 {
    public static void main(String[] args) {
        TreeMap<Student, String> tm = new TreeMap<>();

        Student s1 = new Student("张三", 18);
        Student s2 = new Student("李四", 19);
        Student s3 = new Student("王五", 20);

        tm.put(s1, "广东");
        tm.put(s2, "河南");
        tm.put(s3, "青岛");

        System.out.println(tm);

    }
}
