package com.mycode.mathTest;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        //求质数
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean isPrime = true;

        if (num < 2 || num > 100) {
            System.out.println("输入错误");
            isPrime = false;
        } else if (num == 2) {
            isPrime = false;
        } else if (num % 2 == 0) {
            isPrime = false;
        } else {
            int squareRoot = (int) Math.sqrt(num);
            for (int i = 3; i < squareRoot; i += 2) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }

            }
        }

//       if (num<=1||num>100){
//           isPrime = false;
//           System.out.println("输入错误!");
//       }
//
//        if ((int) Math.sqrt(num) == Math.sqrt(num)) {
//            isPrime = false;
//        } else {
//            int squareRoot = (int)Math.sqrt(num);
//            for (int i1 = 2; i1 < squareRoot; i1++) {
//                for (int i2 = i1; i2 < squareRoot; i2++) {
//                    if (i1 * i2 == num) {
//                        isPrime = false;
//                    }
//
//                }
//            }
//        }

        if (isPrime) {
            System.out.println("是质数");

        } else {
            System.out.println("不是质数");
        }


    }
}
