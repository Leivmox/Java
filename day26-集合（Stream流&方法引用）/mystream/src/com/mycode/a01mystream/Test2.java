package com.mycode.a01mystream;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class Test2 {

    public static void main(String[] args) {

        //1.创建一个ArrayList集合
        ArrayList<String> list = new ArrayList<>();
        //2.添加以下字符串
        list.add("zhangsan,23");
        list.add("lisi,24");
        list.add("wangwu,25");


        Map<String, String> map = list.stream()
                .filter(s -> Integer.parseInt(s.split(",")[1]) > 24)
                .collect(Collectors.toMap(s -> s.split(",")[0], s -> s.split(",")[1]));
        System.out.println(map);

    }
}
