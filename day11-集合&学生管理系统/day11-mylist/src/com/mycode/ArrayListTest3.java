package com.mycode;

import java.util.ArrayList;

public class ArrayListTest3 {
    public static void main(String[] args) {
        //需求：
        //定义Javabean类：Phone
        // Phone属性：品牌，价格。
        //main方法中定义一个集合，存入三个手机对象。
        // 分别为：小米，1000。
        // 苹果，8000。
        // 锤子2999。
        // 定义一个方法，将价格低于3000的手机信息返回。


        //定义集合
        ArrayList<Phone> list = new ArrayList<>();

        //存入对象
        list.add(new Phone("小米", 1000));
        list.add(new Phone("苹果", 8000));
        list.add(new Phone("锤子", 2999));


        System.out.println(getPhone(list));

    }

    public static String getPhone(ArrayList<Phone> list) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getPrice() < 3000) {
                if (i == list.size()-1) {

                    sb.append(list.get(i).toString());
                } else {

                    sb.append(list.get(i).toString()).append(";\n");
                }
            }
        }
        return sb.toString();
    }
}