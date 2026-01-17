package com.mycode;

import java.util.Scanner;

public class test1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入原价:");
        double i = sc.nextByte();
        System.out.println("请输入月份:");
        int m = sc.nextInt();
        System.out.println("请输入是否为头等舱,1.头等舱 2.经济舱");
        int j = sc.nextInt();

        if (m >= 5 && m <= 10) {
            if (j == 1) {
                System.out.println("价格:" + i * 0.9);
            } else {
                System.out.println("价格:" + i * 0.85);
            }
        } else {
            if (j == 1) {
                System.out.println("价格:" + i * 0.7);
            } else {
                System.out.println("价格:" + i * 0.65);
            }

        }

        for (int j = 0; j < 100; j++) {
            
        }
    }
}
