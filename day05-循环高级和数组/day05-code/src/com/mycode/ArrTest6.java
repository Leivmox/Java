package com.mycode;

public class ArrTest6 {
    /*需求：定义一个数组，存入1，2，3，4，5。
    交换首尾索引对应的元素。
    交换前：1,2,3,4,5
    交换后：5,2,3,4,1*/
    static void main() {
        int[] arr = {1, 2, 3, 4, 5};
//        for (int i = 0; i < arr.length; i++) {
//            int tmp = 0;
//            tmp = arr[i];
//            arr[i] = arr[arr.length - 1 - i];
//            arr[arr.length - 1 - i] = tmp;
//        }
        for (int i = 0,j=arr.length-1; i < j; i++,j--) {
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.printf(arr[i] + " ");
        }

    }
}
