package com.mycode;

import java.util.Random;

public class ArrTest5 {
    static void main() {
        Random r = new Random();
        int sum = 0;
        int sum2 = 0;
        int pj= 0;

        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100) + 1;
            System.out.println(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        pj = sum/arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<pj) {
                sum2+=1;
            }

        }

        System.out.println("sum:"+sum);
        System.out.println("平均:"+pj);
        System.out.println("sum2:"+sum2);

    }
}
