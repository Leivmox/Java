package com.mycode;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        //键盘录入一个正整数×，判断该整数是否为一个质数。
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        boolean isPrime = true;
        if (x <= 1) {
            isPrime = false;
            System.out.println("<=1");
        } else {
            for (int i = 2; i < x; i++) {
                for (int j = 2; j <= i;  j++) {
                    if (i * j == x) {
                        isPrime = false;
                        break;
                    }
                }
            }
            System.out.println(isPrime);
        }
    }
}
