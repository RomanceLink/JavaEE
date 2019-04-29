package com.panlong.test.Daysix;

public class DemoMyrunnable {
    public static void main(String[] args) {
        //创建自定义类对象  线程任务对象
        Myrunnable mt=new Myrunnable();
        //创建线程对象
        Thread t=new Thread(mt,"小红爱");
        t.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("牵手"+i);
        }
    }
}
