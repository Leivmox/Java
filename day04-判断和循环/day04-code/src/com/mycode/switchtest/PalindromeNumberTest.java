package com.mycode.switchtest;

import java.util.Scanner;

public class PalindromeNumberTest {
    //回文数判断
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int tmp = num;
        //1234
        int x = 0;
        while (num != 0) {
            x = x * 10 + num % 10;
            num = num / 10;

//            System.out.println("x is " + x);
//            System.out.println("num is " + num);
//            System.out.println("======");
         }
//        System.out.println("x is " + x);
//        System.out.println("tmp is " + tmp);
        if (x == tmp) {
            System.out.println("是回文数");
        } else {
            System.out.println("不是回文数");
        }
    }
}
