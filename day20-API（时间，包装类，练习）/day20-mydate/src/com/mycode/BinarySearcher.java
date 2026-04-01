package com.mycode;

public class BinarySearcher {
    public static void main(String[] args) {
        // 二分查找
        int[] arr = {1, 19, 34, 55, 56, 76, 79, 89, 90, 93, 101, 112, 314};
        System.out.println(binarySearch(arr, 4));

    }

    public static int binarySearch(int[] arr, int number) {
        int min = 0;
        int max = arr.length - 1;
        int mid = 0;
        while (max >= min) {
            mid = (min + max) / 2;
            if (number == arr[mid]) {
                return mid;
            } else if (number < arr[mid]) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        return -1;

    }
}

