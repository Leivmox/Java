package com.itheima.mydoudizhu2;

import java.util.*;

public class PokerGame {
    static HashMap<Integer, String> hm = new HashMap<>();
    static ArrayList<Integer> list = new ArrayList<>();


    static {
        String[] color = {"♠", "♣", "♦", "♥"};
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        int serialNumber = 1;
        for (String n : number) {
            for (String c: color) {
                hm.put(serialNumber, c + n);
                list.add(serialNumber);
                serialNumber++;
            }
        }
        hm.put(serialNumber, "小王");
        list.add(serialNumber);
        serialNumber++;
        hm.put(serialNumber, "大王");
        list.add(serialNumber);

//        System.out.println(list);
    }

    public PokerGame(){
        //洗牌
        Collections.shuffle(list);
        //发牌
        TreeSet<Integer> lord = new TreeSet<>();
        TreeSet<Integer> player01 = new TreeSet<>();
        TreeSet<Integer> player02 = new TreeSet<>();
        TreeSet<Integer> player03 = new TreeSet<>();

        for (int i = 0; i < list.size(); i++) {
            if (i < 3) {
                lord.add(list.get(i));
            } else if (i % 3 == 0) {
                player01.add(list.get(i));
            } else if (i % 3 == 1) {
                player02.add(list.get(i));
            } else {
                player03.add(list.get(i));
            }
        }
//        System.out.println(lord);
//        System.out.println(player01);
//        System.out.println(player02);
//        System.out.println(player03);
        lookPoker("底牌",lord);
        lookPoker("玩家1",player01);
        lookPoker("玩家2",player02);
        lookPoker("玩家3",player03);

    }

    public static void lookPoker(String name, TreeSet<Integer> treeSet) {
        StringJoiner sj = new StringJoiner(",");
        for (Integer i : treeSet) {
            sj.add(hm.get(i));
        }
        System.out.println(name+": "+sj);

    }

}
