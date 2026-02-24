package com.mycode.StringBuilder;

import java.util.Scanner;

public class SymmetricString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串:");
        String str = sc.next();

        StringBuilder sb = new StringBuilder(str);
        String flipstr = sb.reverse().toString();

        if (str.equals(flipstr)) {
            System.out.println("是对称字符串");

        } else {

            System.out.println("不是对称字符串");
        }

    }
}
