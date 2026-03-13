package com.mycode;

public class test2 {
    static void main() {
        Manager manager = new Manager("123","张三",100,100);
        manager.work();
        Cook cook = new Cook();
        cook.work();
    }
}
