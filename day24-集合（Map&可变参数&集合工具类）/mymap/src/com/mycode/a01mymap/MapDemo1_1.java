package com.mycode.a01mymap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo1_1 {
    public static void main(String[] args) {
        Map<String, String> m = new HashMap<>();
        m.put("A", "a");
        m.put("B", "b");
        m.put("C", "c");

        System.out.println(m);

        System.out.println("增强for");
//        System.out.println(m.put("B", "bb"));
        Set<String> keys = m.keySet();
        for (String key : keys) {
            System.out.println(key+"->"+m.get(key));
        }


        System.out.println("键值对对象");
        Set<Map.Entry<String, String>> entries = m.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey()+"->"+entry.getValue());
        }
    }
}
