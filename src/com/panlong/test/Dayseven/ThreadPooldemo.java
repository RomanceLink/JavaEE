package com.panlong.test.Dayseven;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPooldemo {
    public static void main(String[] args) {
        //创建线程池对象
        ExecutorService service = Executors.newFixedThreadPool(10);
        //创建Runnable对象
        MyRunnable r=new MyRunnable();


        for (int i = 0; i < 10; i++) {
            service.submit(r);
        }

        MyRunnableDemo rd=new MyRunnableDemo();
        for (int i = 0; i < 10; i++) {
            service.submit(rd);
        }
    }
}
