package com.mycode;

import java.util.Scanner;

public class AmountConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个金额:");
        int num = sc.nextInt();
    }

    public static String getCapitalNumber(int num) {
        String[] arr = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
        return arr[num];
    }

}
