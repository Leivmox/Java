package com.mycode.String;

public class PhoneNumberMask {
    public static void main(String[] args) {
        String phoneNumber = "13711711117";
        //截取手机号码前面三位
        String start = phoneNumber.substring(0, 3);
//        System.out.println(start);

        //截取手机号码前后四位
//        String end = phoneNumber.substring(7,11);
        String end = phoneNumber.substring(7);


        String newPhone = start + "****" + end;
        System.out.println(newPhone);

    }
}
