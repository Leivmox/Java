package com.itheima.mycode;

import java.util.ArrayList;
import java.util.Collections;

public class test2 {
    public static void main(String[] args) {
        ArrayList<String > list = new ArrayList<>();
        Collections.addAll(list, "1", "1", "1", "1", "1", "1", "1", "0", "0", "0");
        Collections.shuffle(list);

        ArrayList<String> boyList = new ArrayList<>();
        ArrayList<String> girlList = new ArrayList<>();

        Collections.addAll(boyList, "A", "B", "C", "D", "E");
        Collections.addAll(girlList, "a", "b", "c", "d", "e");
        if (list.get(0).equals("1")) {
            Collections.shuffle(boyList);
            System.out.println(boyList.get(0));
        } else {

            Collections.shuffle(girlList);
            System.out.println(girlList.get(0));
        }
    }
}
