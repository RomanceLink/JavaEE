package com.panlong.test.Dayfive;

public class Mythread extends Thread{
    public Mythread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName()+":正在执行!"+i);
        }
    }
}
