package com.panlong.test.Daysix;

public class DemoMythread {
    public static void main(String[] args) {
        Mythread mt= new Mythread("小强");
        mt.start();//开启了一个新的线程
        for (int i = 0; i < 20; i++) {
            System.out.println("旺财"+i);
        }


    }
}
