package com.mycode.StringBuilder;

public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("123");
        sb.append("123");
        sb.append("123");
        sb.append("aabb");

        System.out.println(sb);
        sb.reverse();

        System.out.println(sb);

        System.out.println(sb.length());
        String str = sb.toString();
        System.out.println(str);

    }
}
