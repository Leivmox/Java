package com.itheima.mycode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class test1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"A", "B", "C", "D", "E", "F", "G");
        Random r = new Random();
        int i = r.nextInt(list.size());
        System.out.println(list.get(i));

        // 第二种方法:打乱集合
        Collections.shuffle(list);
        System.out.println(list.get(0));
    }
}
