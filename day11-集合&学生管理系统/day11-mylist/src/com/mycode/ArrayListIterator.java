package com.mycode;

import java.util.ArrayList;

public class ArrayListIterator {
    public static void main(String[] args) {
        // 集合遍历
        ArrayList<String> list = new ArrayList<>();

        list.add("甲");
        list.add("乙");
        list.add("丙");
        list.add("丁");


        //遍历
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                System.out.print(list.get(i));
            } else {
                System.out.print(list.get(i)+", ");
            }
        }
        System.out.println("]");
    }
}
