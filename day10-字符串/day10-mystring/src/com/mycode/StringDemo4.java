package com.mycode;

import java.util.Scanner;

public class StringDemo4 {
    static void main() {
        String user = "leivmox";
        String passwd = "123456A";

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入账号:");
            String u = sc.next();
            System.out.println("请输入密码:");
            String p = sc.next();

            if (u.equals(user) && p.equals(passwd)) {
                System.out.println("登录成功");
                break;
            }
            System.out.println("登录失败,请重新登录,还剩下" + (2 - i) + "次机会");

        }
    }
}
