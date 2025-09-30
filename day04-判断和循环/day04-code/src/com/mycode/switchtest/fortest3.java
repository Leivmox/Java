package com.mycode.switchtest;

import java.util.Scanner;

public class fortest3 {
    public static void main(String[] args) {
        System.out.println("输入第一个数字");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println("输入第二个数字");
        Scanner sc1 = new Scanner(System.in);
        int b = sc1.nextInt();
        int sum = 0;
        for (int i = a; i <= b; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum++;
            }
        }
        System.out.println(sum);
    }
}
