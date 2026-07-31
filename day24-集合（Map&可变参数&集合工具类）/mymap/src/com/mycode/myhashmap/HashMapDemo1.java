package com.mycode.myhashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class HashMapDemo1 {
    public static void main(String[] args) {

        Student s1 = new Student("张三", 18);
        Student s2 = new Student("李四", 17);
        Student s3 = new Student("王五", 20);
        Student s4 = new Student("王五", 20);

        HashMap<Student, String> m = new HashMap<>();
        m.put(s1, "广东");
        m.put(s2, "湖南");
        m.put(s3, "福建");
        m.put(s4, "广西");

        System.out.println(m);
        System.out.println("======");
        Set<Student> students = m.keySet();
        for (Student student : students) {
            System.out.println(student.name + "->" + m.get(student));
        }
        System.out.println("======");

        Set<Map.Entry<Student, String>> entries = m.entrySet();
        for (Map.Entry<Student, String> entry : entries) {
            System.out.println(entry.getKey().name + "->" + entry.getValue());
        }

        System.out.println("======");
        m.forEach(new BiConsumer<Student, String>() {
            @Override
            public void accept(Student student, String string) {
                System.out.println(student.name + "->" + string);
            }
        });
        System.out.println("======");
        m.forEach((student, string) -> System.out.println(student.name + "->" + string));

    }
}
