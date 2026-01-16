package com.mycode;

import java.util.Random;

public class ArrTest7 {
    static void main() {
        int[] arr = {1, 2, 3, 4, 5};
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int tmp = arr[i];
            int randomIndex = r.nextInt(arr.length);
            arr[i] = arr[randomIndex];
            arr[randomIndex] = tmp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);

        }
    }
}
