package com.mycode.a01mystream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class StreamDemo3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "A", "B", "C", "D", "E", "F");

        long count = list.stream().count();
        System.out.println(count);
        System.out.println("======");
        list.forEach(string -> System.out.print(string));
        System.out.println();
        System.out.println("======");
        String [] array = list.toArray(value -> new String[value]);
        System.out.println(Arrays.toString(array));

    }
}
