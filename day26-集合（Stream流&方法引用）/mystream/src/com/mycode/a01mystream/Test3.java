package com.mycode.a01mystream;

import com.itheima.a02test.Actor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test3 {
    public static void main(String[] args) {

        //1.创建两个ArrayList集合
        ArrayList<String> manList = new ArrayList<>();
        ArrayList<String> womenList = new ArrayList<>();
        //2.添加数据
        Collections.addAll(manList, "蔡坤坤,24", "叶齁咸,23", "刘不甜,22", "吴签,24", "谷嘉,30", "肖梁梁,27");
        Collections.addAll(womenList, "赵小颖,35", "杨颖,36", "高元元,43", "张天天,31", "刘诗,35", "杨小幂,33");

        Stream<String> stream1 = manList.stream().filter(s -> s.split(",")[0].length() == 3).limit(3);
        Stream<String> stream2 = womenList.stream().filter(s -> s.startsWith("杨")).skip(1);
        List<Actor> list = Stream.concat(stream1, stream2).
                map(string -> new Actor(string.split(",")[0], Integer.parseInt(string.split(",")[1])))
                .collect(Collectors.toList());
        System.out.println(list);


    }
}
