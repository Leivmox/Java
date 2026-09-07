package com.mycode.myfunction;
import java.util.Arrays;
public class Demo1 {
    public static void main(String[] args) {

        Integer[] arr = {3, 5, 4, 1, 6, 2};
        //======
//        Arrays.sort(arr, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2 - o1;
//            }
//        });
        //======
//        Arrays.sort(arr,(o1,o2)-> o2- o1 );
        //======
        Arrays.sort(arr,Demo1::subtration);
        System.out.println(Arrays.toString(arr));
    }

    public static int subtration(int num1, int num2) {
        return num2 - num1;
    }
}
