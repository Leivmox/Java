package com.mycode.a03;

import java.util.ArrayList;

public class StudentUtil {
    private StudentUtil() {

    }

    public static int getMaxAge(ArrayList<Student> list) {
        int maxAge = 0;
        for (int i = 0; i < list.size(); i++) {
            if (maxAge < list.get(i).getAge()) {
                maxAge = list.get(i).getAge();
            }
        }
        return maxAge;

    }
}
