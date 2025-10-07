package com.mycode.switchtest;

public class whiletest {
    public static void main(String[] args) {
        int count = 0;
        double a = 0.1;
        while (a <= 8844430) {
            a = a * 2;
            count++;
        }
        System.out.println("count = " + count);

        int count2 = 0;
        double b = 0.1;
        for (; b <= 8844430; count2++) {
           b=b*2;

        }
        System.out.println("count = " + count2);
    }
}
