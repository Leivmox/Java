package com.mycode.treemap;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo01 {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {

                return o2-o1;
            }
        });


        tm.put(2, "AAA");
        tm.put(2, "aaa");
        tm.put(3, "BBB");
        tm.put(1, "CCC");
        System.out.println(tm);


    }
}
