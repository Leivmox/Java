package com.mycode;

public class IdCardInfo {
    public static void main(String[] args) {
        String id = "444444200201014444";
        //获取出生年月日
        String year = id.substring(6, 10);
        String mon = id.substring(10, 12);
        String day = id.substring(12, 14);

        System.out.println("人物信息为:");
        System.out.println("出生年月日:"+year+"年"+mon+"月"+day+"日");
        char gender = id.charAt(16);
        int i = gender - 48;
//        System.out.println(i);
        if (i % 2 == 0) {
            System.out.println("性别为:女");
        } else {
            System.out.println("性别为:男");
        }


    }
}
