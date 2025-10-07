package com.mycode;

import java.util.Scanner;

public class SquareRoot {
    //求平方根
    //需求：键盘录入一个大于等于2的整数×，计算并返回×的平方根。
    // 结果只保留整数部分，小数部分将被舍去。
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        while (true) {
            a++;
            if (a*a > n) {
                System.out.println(a-1);
                break;
            }


        }
    }
}
