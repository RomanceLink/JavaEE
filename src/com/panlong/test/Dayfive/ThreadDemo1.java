package com.panlong.test.Dayfive;

public class ThreadDemo1 {
    public static void main(String[] args) {
        //创建自定义线程对象
        Mythread mt = new Mythread("新的线程");

        //开启新线程
        mt.start();

        //在主方法中执行for循环
        for (int i = 0; i < 10; i++) {
            System.out.println("main线程!"+i);
        }
    }
}
