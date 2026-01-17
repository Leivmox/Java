package com.mycode;

public class Test {
    static void main() {
        Role r1 = new Role("乔峰", 100);
        Role r2 = new Role("鸠摩智", 100);

        while (true) {
            r1.attack(r2);
            if (r2.health == 0) {
                break;
            }
            r2.attack(r1);
            if (r1.health == 0) {
                break;
            }
        }

    }
}
