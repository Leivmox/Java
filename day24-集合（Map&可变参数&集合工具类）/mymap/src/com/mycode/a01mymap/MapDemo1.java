package com.mycode.a01mymap;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {
    public static void main(String[] args) {
        Map<String, String> m = new HashMap<>();

        m.put("1", "A");
        m.put("2", "B");
        m.put("3", "C");

        System.out.println(m);

        m.put("1", "D");
        System.out.println(m);

        m.remove("2");

        System.out.println(m);
    }
}
