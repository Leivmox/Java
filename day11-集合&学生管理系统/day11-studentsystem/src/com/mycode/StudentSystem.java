package com.mycode;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
    public static void main(String[] args) {

        //创建学生集合
        ArrayList<Student> list = new ArrayList<>();
        loop: while (true) {

            System.out.println("=== 欢迎来到学生管理系统 ===");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查询学生");
            System.out.println("5.退出");
            System.out.println("请输入选择:");

            Scanner sc = new Scanner(System.in);

            String choose = sc.next();
            switch (choose) {
                case "1" -> addStudent(list);
                case "2" -> delStudent(list);
                case "3" -> updateStudent(list);
                case "4" -> queryStudent(list);
                case "5" -> {
                        System.out.println("退出");
                        break loop;
                }

                default -> System.out.println("输入错误");

            }
        }

    }

    public static void addStudent(ArrayList<Student> list) {
        System.out.println("添加学生");
        //#### 添加功能：
        //
        //键盘录入每一个学生信息并添加，需要满足以下要求：
        //
        //* id唯一
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生的id");
        String id = sc.next();
        System.out.println("请输入学生的姓名");
        String name = sc.next();
        System.out.println("请输入学生的年龄");
        int age = sc.nextInt();
        System.out.println("请输入学生的住址");
        String address = sc.next();

        //判断id是否已经存在
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)) {
                System.out.println("id已存在");
                return;
            }
        }
        Student s = new Student(id, name, age, address);
        list.add(s);

    }

    public static void delStudent(ArrayList<Student> list) {

        System.out.println("删除学生");
        //* id存在删除
        //* id不存在，需要提示不存在，并回到初始菜单

        //获取输入
        System.out.println("请输入需要删除的学生id");
        Scanner sc = new Scanner(System.in);
        String id = sc.next();

        //判断id是否存在
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)) {
                list.remove(i);
                System.out.println("删除成功!");
                return;
            }
        }
        System.out.println("该学生不存在,删除失败!");


    }

    public static void updateStudent(ArrayList<Student> list) {
        System.out.println("修改学生");
        //​	键盘录入要修改的学生id，需要满足以下要求
        //
        //* id存在，继续录入其他信息
        //* id不存在，需要提示不存在，并回到初始菜单

        //键盘录入
        System.out.println("请输入需要修改的学生id");
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        //判断id是否存在
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)) {
                System.out.println("请输入修改后的姓名");
                list.get(i).setName(sc.next());
                System.out.println("请输入修改后的年龄");
                list.get(i).setAge(sc.nextInt());
                System.out.println("请输入修改后的住址");
                list.get(i).setAddress(sc.next());
                return;
            }
        }
        System.out.println("未找到该学生!");

    }

    public static void queryStudent(ArrayList<Student> list) {
        System.out.println("查询学生");

        //打印所有的学生信息，需要满足以下要求
        //
        //* 如果没有学生信息，提示：当前无学生信息，请添加后再查询
        //* 如果有学生信息，需要按照以下格式输出。（不用过于纠结对齐的问题）
        //id			姓名		年龄		家庭住址
        //heima001	张三		23		 南京
        //heima002	李四		24		 北京
        //heima003	王五		25		 广州
        //heima004	赵六	 	26		 深圳

        //判断是否为空
        if (list.size() == 0) {
            System.out.println("当前无学生信息，请添加后再查询");
            return;
        } else {
            System.out.println("id\t姓名\t年龄\t住址");
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i).getId()+"\t"+list.get(i).getName()+"\t"+list.get(i).getAge()+"\t"+list.get(i).getAddress());
            }
        }


    }

}
