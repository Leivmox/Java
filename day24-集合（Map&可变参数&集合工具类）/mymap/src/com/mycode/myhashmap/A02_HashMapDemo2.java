package com.mycode.myhashmap;

import java.util.*;

public class A02_HashMapDemo2 {
    public static void main(String[] args) {
        String[] arr = {"A", "B", "C", "D"};
        ArrayList<String> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 80; i++) {
            int index = r.nextInt(arr.length);
            list.add(arr[index]);
        }
//        System.out.println(list);
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            //如果已经存在景点
            if (map.containsKey(list.get(i))) {
                int count = map.get(list.get(i));
                count++;
                map.put(list.get(i), count);
            } else {
                //如果不存在景点,新增map key
                map.put(list.get(i), 1);
            }
        }
        int max = 0;
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            //先打印所有的
            System.out.println(entry.getKey() + "->" + entry.getValue());
            if (entry.getValue() > max) {
                max = entry.getValue();
            }
        }
        for (Map.Entry<String, Integer> entry : entries) {
            if (entry.getValue() == max) {
                System.out.println("最多投票:");
                System.out.println(entry.getKey() + "->" + entry.getValue());
            }
        }
    }
}
