package com.mycode;

public class quotient {
    static void main() {
        int i = 20;
        int tmp  =i;
        int j = 3;
        int s = 0;
        while (i>j) {
            i -= j;
            s ++;
        }
        System.out.println(s);
        System.out.println(i);
    }
}
