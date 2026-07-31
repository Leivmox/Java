package com.mycode.treemap;
import java.util.TreeMap;

public class TreeMapDemo03 {
    public static void main(String[] args) {
        /*
        需求:字符串“aababcabcdabcde"
        请统计字符串中每一个字符出现的次数,并按照以下格式输出输出结果:
        a(5)b(4) c(3) d(2)e(1)
         */
        String s = "aababcabcdabcde";

        TreeMap<Character, Integer> tm = new TreeMap();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (tm.containsKey(c)) {
                int count = tm.get(c);
                count++;
                tm.put(c, count);
            } else {
                tm.put(c, 1);
            }
        }
        StringBuilder sb = new StringBuilder();
//        a(5)b(4) c(3) d(2)e(1)
        tm.forEach((character, integer) -> sb.append(character).append("(").append(integer).append(")"));
        System.out.println(sb);
    }

}
