package com.mycode;

import java.util.ArrayList;

public class ArrayListIterator3 {
    public static void main(String[] args) {
        // 集合遍历: 对象集合

        ArrayList<Student> list = new ArrayList<>();

       //创建对象
        Student stu1 = new Student("张三", 20);
        Student stu2 = new Student("李四", 19);
        Student stu3 = new Student("王五", 21);
        Student stu4 = new Student("赵六", 22);

        //添加到集合
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        list.add(stu4);


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
