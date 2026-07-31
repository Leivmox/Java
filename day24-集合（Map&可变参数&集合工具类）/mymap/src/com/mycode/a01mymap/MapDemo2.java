package com.mycode.a01mymap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {
    public static void main(String[] args) {
        Map<String, String> m = new HashMap<>();

        m.put("1", "A");
        m.put("2", "B");
        m.put("3", "C");

        Set<String> keys = m.keySet();
        for (String key : keys) {
//            System.out.println(key);
            System.out.println(key+" = "+m.get(key));
        }

    }
}
