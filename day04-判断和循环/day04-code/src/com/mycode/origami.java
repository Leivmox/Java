package com.mycode;

public class origami {
    static void main() {
        int sum = 0;
        for (float i = 0.1F; i <= 8844430; i *= 2) {
           sum ++;
        }
        System.out.println(sum);

       int sum2 = 0;
       float i2 = 0.1F;
        while (i2 <= 8844430) {
            i2 *= 2;
            sum2++;
        }
        System.out.println(sum2);
    }

}
