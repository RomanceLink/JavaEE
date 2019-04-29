package com.panlong.test.Dayseven;

public class MyRunnableDemo implements Runnable {
    @Override
    public void run() {
        System.out.println("我要一个小姐");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("小姐来了:"+Thread.currentThread().getName());
        System.out.println("小姐做完又回到了房间");
    }
}
