package com.mycode;

public class StringDemo8 {
    static void main() {
        String str = "12345";
        System.out.println(reverser(str));


    }

    public static String reverser(String str) {
        String str2 = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            str2 += str.charAt(i);
        }
        return str2;
    }
}
