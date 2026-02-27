package com.mycode;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListIterator4 {
    public static void main(String[] args) {
        // 集合遍历: 对象集合  键盘录入对象属性

        ArrayList<Student> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        //循环添加对象到集合
        for (int i = 1; i < 5; i++) {
            String name = "";
            int age = 0;
            System.out.println("请输入学生"+i+"的姓名:");
            name = sc.next();
            System.out.println("请输入学生" + i + "的年龄:");
            age = sc.nextInt();
            Student stu = new Student(name, age);
            //添加到集合
            list.add(stu);

        }


//       //创建对象
//        Student stu1 = new Student("张三", 20);
//        Student stu2 = new Student("李四", 19);
//        Student stu3 = new Student("王五", 21);
//        Student stu4 = new Student("赵六", 22);
//
//        //添加到集合
//        list.add(stu1);
//        list.add(stu2);
//        list.add(stu3);
//        list.add(stu4);


        //遍历
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            //最大索引
            if (i == list.size()-1) {
                System.out.print(list.get(i).getName());
                //非最大索引
            } else {
                System.out.print(list.get(i).getName()+",");
            }
        }
        System.out.print("]");
    }
}
