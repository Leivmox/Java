package com.mycode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ImmutableDemo1 {
    public static void main(String[] args) {
//        List<String> list = List.of("A", "B", "C", "D");
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        System.out.println("=====");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("=====");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("=====");
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("=====");
        list.forEach(string -> System.out.println(string));

    }
}
