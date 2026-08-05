package com.itheima.mycode;

import java.util.*;

public class Test4 {
    public static void main(String[] args) {

        HashMap<String, ArrayList<String>> map = new HashMap<>();

        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<String> list3 = new ArrayList<>();
        ArrayList<String> list4 = new ArrayList<>();
        Collections.addAll(list1,"a1", "a2", "a3", "a4");
        Collections.addAll(list2, "b1", "b2", "b3", "b4");
        Collections.addAll(list3, "c1", "c2", "c3", "c4");
        Collections.addAll(list4, "d1", "d2", "d3", "d4");

        map.put("A", list1);
        map.put("B", list2);
        map.put("C", list3);
        map.put("D", list4);

        Set<Map.Entry<String, ArrayList<String>>> entries = map.entrySet();

        for (Map.Entry<String, ArrayList<String>> entry : entries) {
            StringJoiner sj = new StringJoiner(",", "", "");
            for (String s : entry.getValue()) {
                sj.add(s);
            }
            System.out.println(entry.getKey()+" = "+sj);
        }
    }
}
