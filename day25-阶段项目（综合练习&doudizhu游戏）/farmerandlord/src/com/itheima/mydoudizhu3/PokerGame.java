package com.itheima.mydoudizhu3;

import java.util.*;

public class PokerGame {
    static HashMap<String,Integer> hm = new HashMap<>();
    static ArrayList<String > list = new ArrayList<>();


    static {
        String[] color = {"♠", "♣", "♦", "♥"};
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        int serialNumber = 1;
        for (String n : number) {
            for (String c: color) {
                list.add(c + n);
            }
        }
        list.add(" 小王");
        list.add(" 大王");

        hm.put("小王", 101);
        hm.put("大王", 102);
        hm.put("J", 11);
        hm.put("Q", 12);
        hm.put("K", 13);
        hm.put("A", 14);
        hm.put("2", 15);
//        System.out.println(list);
    }

    public PokerGame(){
        //洗牌
        Collections.shuffle(list);
        //发牌
        ArrayList<String > lord = new ArrayList<>();
        ArrayList<String > player01 = new ArrayList<>();
        ArrayList<String > player02 = new ArrayList<>();
        ArrayList<String > player03 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            String  poker = list.get(i);
            if (i < 3) {
                lord.add(poker);
            } else if (i % 3 == 0) {
                player01.add(poker);
            } else if (i % 3 == 1) {
                player02.add(poker);
            } else {
                player03.add(poker);
            }
        }

        order(lord);
        order(player01);
        order(player02);
        order(player03);

        lookPoker("底牌: ", lord);
        lookPoker("玩家1: ",player01);
        lookPoker("玩家2: ",player02);
        lookPoker("玩家3: ",player03);
//        System.out.println(lord);
//        System.out.println(player01);
//        System.out.println(player02);
//        System.out.println(player03);

    }

    public void order(ArrayList<String > list) {
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String color1 = o1.substring(0, 1);
                int value1 = getValue(o1);

                String color2 = o2.substring(0, 1);
                int value2 = getValue(o2);

                int i = value1 - value2;
                return i == 0 ? color1.compareTo(color2) : i;
            }
        });
    }

    public int getValue(String v) {
        String value = v.substring(1);
        if (hm.containsKey(value)) {
            return hm.get(value);
        } else {
            return Integer.parseInt(value);
        }
    }

    public void lookPoker(String name,ArrayList<String> list) {
        System.out.print(name);
        System.out.print(" " + list);
        System.out.println();
    }


}
