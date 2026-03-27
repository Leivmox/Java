package com.mycode.mathTest;

import java.util.Scanner;

public class NarcissisticNumber {
    public static void main(String[] args) {
        int sum= 0 ;

        //求水仙花数
        for (int i = 100; i < 1000; i++) {
            //Ones, Tens, Hundreds
            int ones = 0;
            int tens = 0;
            int hundreds = 0;

            ones = i % 10;
            tens = i / 10 % 10;
            hundreds = i /100 % 10;

            if (Math.pow(ones, 3) + Math.pow(tens, 3) + Math.pow(hundreds, 3) == i) {
                sum += 1;
                System.out.println(i);
            }

        }
        System.out.println(sum);

    }
}
