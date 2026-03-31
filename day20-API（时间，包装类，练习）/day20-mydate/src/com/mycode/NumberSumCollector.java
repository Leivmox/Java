package com.mycode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberSumCollector {
    public static void main(String[] args) {
        /*
        键盘录入一些1~100之间的整数，并添加到集合中。
        直到集合中所有数据和超过200为止。
         */
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        Loop:
        while (true) {
            int sum = 0;
            for (int i = 0; i < list.size(); i++) {
                sum += list.get(i);
                if (sum >= 200) {
                    System.out.println("总数超过200!");
                    break Loop;
                }
            }
            int i = Integer.parseInt(sc.nextLine());
            list.add(i);

        }
    }
}
