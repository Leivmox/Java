package com.mycode.day11Test;

import java.util.Scanner;

public class RomanNumeralConverter {
    // 键盘录入一个字符串，
    // 要求1：长度为小于等于9
    // 要求2：只能是数字将内容变成罗马数字
    //下面是阿拉伯数字跟罗马数字的对比关系：
    //I - 1、II - 2、III - 3、IV - 4、V - 5、VI - 6、VII - 7、VIII- 8、IX - 9 注意点：
    //罗马数字里面是没有0的
    //如果键盘录入的数字包含0，可以变成””（长度为0的字符串）
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个长度小于等于9的字符串:");
        String str = sc.next();

        System.out.println(str);

        if (!validateString(str)) {
            System.out.println("字符串不合法");
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            sb.append(toRomanNumeral(str.charAt(i)-'0')).append(" ");
        }
        System.out.println(sb);

    }

    public static boolean validateString(String str) {
        if (str.length() > 9) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) < '0' || str.charAt(i) > '9') {
                return false;
            }
        }

        return true;
    }

    public static String toRomanNumeral(int i) {
        String[] arr = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX",};
        return arr[i];

    }
}
