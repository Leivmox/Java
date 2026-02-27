package com.mycode;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        //添加用户对象并判断是否存在
        //需求：
        //1，main方法中定义一个集合，存入三个用户对象。
        // 用户属性为：id，username，password
        //2，要求：定义一个方法，根据id查找对应的用户信息。
        //如果存在，返回true
        //如果不存在，返回false

        //创建对象
        User u1 = new User(1, "zhangsan", "123456");
        User u2 = new User(2, "lisi", "123456");
        User u3 = new User(3, "wangwu", "123456");

        //创建集合
        ArrayList<User> list = new ArrayList<>();
        list.add(u1);
        list.add(u2);
        list.add(u3);

        System.out.println(getIndex(2,list));
    }


    //定义查询方法
    public static int getIndex(int id, ArrayList<User> list) {
        for (int i = 0; i < list.size(); i++) {
            if (id == list.get(i).getId()) {
                return i;
            }
        }
        return -1;
    }
}
