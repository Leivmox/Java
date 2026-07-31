package com.mycode;


public class HashSetTest1 {
    public static void main(String[] args) {


        Student stu1 = new Student("张三", 15);
        Student stu2 = new Student("张三", 15);

        System.out.println(stu1.hashCode());
        System.out.println(stu2.hashCode());
    }

}
