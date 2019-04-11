package com.panlong.test.Daythree;

import java.util.HashSet;

public class HashSet1 {
    public static void main(String[] args) {
        //创建集合对象 存储Student类型对象
        HashSet<Student> stuSet = new HashSet<>();

        //存储
        Student stu = new Student("于谦", 23);
        stuSet.add(stu);
        stuSet.add(new Student("郭德纲",20));
        stuSet.add(new Student("周芷若",23));
        stuSet.add(new Student("于谦",23));
        stuSet.add(stu);
        //需要重写toString 方法 否则会打印地址值
        for (Student student : stuSet) {
            System.out.println(student);
        }
    }
}
