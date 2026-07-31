package com.mycode;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;

public class SetCollectionTest1 {
    public static void main(String[] args) {

        Set<String> s = new HashSet<>();

        s.add("张三");
        s.add("李四");

        System.out.println(s);

        Iterator<String> it = s.iterator();
        while (it.hasNext()) {
            String str = it.next();
            System.out.println(str);
        }
        System.out.println("===");
        for (String str2 : s) {
            System.out.println(str2);
        }


        System.out.println("===");
        s.forEach(new Consumer<String>() {
            @Override
            public void accept(String str3) {
                System.out.println(str3);
            }
        });

        System.out.println("===");

        s.forEach(str4 -> System.out.println(str4));
    }

}
