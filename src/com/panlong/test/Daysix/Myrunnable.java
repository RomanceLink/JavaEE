package com.panlong.test.Daysix;

public class Myrunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"小明"+i);
        }
    }
}
