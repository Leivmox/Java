package com.mycode.switchtest;

public class DivisionAlgorithm {
    //需求:给定两个整数，被除数和除数(都是正数，且不超过int的范围)
    // 将两数相除，要求不使用乘法、除法和 %运算符。
    // 得到商和余数，
    public static void main(String[] args) {
        int a = 111230;
        int b = 3;
        int tmp = b;
        int count = 1;

        for (; tmp <= a; count++) {
            tmp += b;
            System.out.println("第" + count + "次:tmp=" + tmp);
        }
        tmp -= b;
//        System.out.println(a / b);
//        System.out.println(a % b);
        System.out.println(count - 1);
        System.out.println(a - tmp);

    }
}
