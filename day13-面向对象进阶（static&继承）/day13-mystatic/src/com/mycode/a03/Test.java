package com.mycode.a03;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("张三", 19, "男"));
        list.add(new Student("李四", 20, "男"));
        list.add(new Student("小红", 1, "女"));

        System.out.println(StudentUtil.getMaxAge(list));
    }
}
