package com.mycode.day11Test;

public class StringRotation {
    //给定两个字符串，A和B。
    //A的旋转操作就是将A最左边的字符移动到最右边。
    //例如,若A='abcde'，在移动一次之后结果就是'bcdea′。
    // 如果在若干次调整操作之后，A能变成B，那么返回True。
    // 如果不能匹配成功，则返回false
    public static void main(String[] args) {
        String A = "abcde";
        String B = "bcdea";


        boolean result = false;
        String tmp = A;
        for (int i = 0; i < A.length(); i++) {
            tmp = stringRotation(tmp);
            if (tmp.equals(B)) {
                result = true;
            }
        }
        System.out.println(result);
    }

    public static String stringRotation(String str) {
        char tmp = str.charAt(0);
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < str.length(); i++) {
            sb.append(str.charAt(i));
        }
        sb.append(tmp);

        return sb.toString();
    }
}
