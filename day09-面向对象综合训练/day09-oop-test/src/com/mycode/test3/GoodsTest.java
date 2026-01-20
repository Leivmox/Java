package com.mycode.test3;

import java.util.Scanner;

public class GoodsTest {
    static void main() {
        Goods[] arr = new Goods[3];

        Goods g1 = new Goods(001, "华为", 1000, 200);
        Goods g2 = new Goods(002, "小米", 500, 700);
        Goods g3 = new Goods(003, "苹果", 2999, 100);

        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;


        for (int i = 0; i < arr.length; i++) {
            System.out.println("id:"+arr[i].getId()+",name:"+arr[i].getName()+",Price:"+arr[i].getPrice()+",Count:"+arr[i].getCount());

        }
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();


    }
}
