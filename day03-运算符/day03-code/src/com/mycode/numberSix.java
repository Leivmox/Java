package com.mycode;

import java.util.Scanner;

public class numberSix {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个两位数:");
        int a = sc.nextInt();
        System.out.println(a % 10 == 6 || a / 10 == 6 || (a % 10 + a / 10) % 6 == 0);

    }
}
