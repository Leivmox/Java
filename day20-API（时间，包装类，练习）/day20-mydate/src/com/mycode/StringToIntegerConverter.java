package com.mycode;

public class StringToIntegerConverter {
    public static void main(String[] args) {
        //自己实现pprseInt方法的效果，将字符串形式的数据转成整数。要求：
        //字符串中只能是数字不能有其他字符最少一位，最多10位
        //0不能开头
        String str = "123455";
        if (!str.matches("[1-9]\\d{0,9}")) {
            System.out.println("格式错误!");
        } else {
            int num = 0;
            for (int i = 0; i < str.length(); i++) {
                int c = str.charAt(i) - '0';
                num = num * 10 + c;


            }
            System.out.println(num+1);
        }
    }
}
