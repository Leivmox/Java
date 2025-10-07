package com.mycode;

public class PassingThroughEverySeventh {
    //逢七过
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            int tmp = i;
            boolean if7 = false;
            while (tmp > 0) {
                int ge = tmp % 10;
                tmp /= 10;
                if (ge == 7) {
                    if7 = true;
                    break;
                }
            }
            if (if7 || i % 7 == 0) {
                System.out.println("过");
                continue;
            }
            System.out.println(i);
        }
    }
}
