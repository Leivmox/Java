package com.mycode;

import java.io.File;
import java.io.IOException;

public class test01 {
    public static void main(String[] args) throws IOException {
        File file = new File("day27-IO(异常&File&综合案例）\\myfile\\bbb");
        file.mkdirs();
        File src = new File(file, "a.txt");
        boolean b = src.createNewFile();
        if (b) {
            System.out.println("成功");
        } else {
            System.out.println("失败");
        }
    }
}
