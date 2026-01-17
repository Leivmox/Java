package com.mycode;

import java.util.Random;

public class Role {
    String name;
    int health;

    public Role() {
    }

    public Role(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public void attack(Role role) {

        Random r = new Random();
        int hurt = r.nextInt(20) + 1;

        role.health -= hurt;
        if (role.health < 0) {
            role.health = 0;
        }
        System.out.println(this.name+"攻击了"+role.name+",造成了"+hurt+"点伤害,"+role.name+"剩余"+role.health);
    }
}
