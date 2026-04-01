package com.mycode;

public class ToBinaryString {
    public static void main(String[] args) {
        //定义一个方法自己实现toBinaryString方法的效果，将一个十进制整数转成字符串表示的二进制。

        int i = 6;
        System.out.println(toBinaryString(i));
    }

    public static String toBinaryString(int i) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            sb.append(i % 2);
            i /= 2;
            if (i == 0) {
                break;
            }
        }
        sb.reverse();


        return sb.toString();
    }

}
