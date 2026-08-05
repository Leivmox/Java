package com.itheima.mydoudizhu;

import java.util.ArrayList;
import java.util.Collections;

public class PokerGame {
    static ArrayList<String> list = new ArrayList<>();


    static {
        String[] color = {"♠", "♣", "♦", "♥"};
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        for (String s : color) {
            for (String string : number) {
                list.add(s + string);
            }
        }
        list.add("小王");
        list.add("大王");


    }

    public PokerGame() {
        Collections.shuffle(list);

        ArrayList<String> lord = new ArrayList<>();
        ArrayList<String> player01 = new ArrayList<>();
        ArrayList<String> player02 = new ArrayList<>();
        ArrayList<String> player03 = new ArrayList<>();

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
//        System.out.println("lord: " + lord);
//        System.out.println("player01: "+player01);
//        System.out.println("plyaer02: "+player02);
//        System.out.println("player03: "+player03);
        lookPoker("底牌", lord);
        lookPoker("玩家1",player01);
        lookPoker("玩家2",player02);
        lookPoker("玩家3",player03);


    }

    public static void lookPoker(String name,ArrayList<String> list) {
        System.out.print(name+":");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(" "+list.get(i));
        }
        System.out.println();
    }

}
