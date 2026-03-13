package com.mycode;

public class Cook extends employee {
    public Cook() {
    }

    public Cook(String id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.printf("炒菜");
    }
}
