package com.panlong.test.Dayseven;

public class LambdaNoob {
    public static void main(String[] args) {
        Runnable r=new Runnable(){
            @Override
            public void run() {
                System.out.println("多线程任务执行!"+Thread.currentThread().getName());
            }
        };
        new Thread(r).start();//启动线程
    }
}
