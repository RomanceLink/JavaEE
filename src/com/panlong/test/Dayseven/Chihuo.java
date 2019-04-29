package com.panlong.test.Dayseven;

public class Chihuo extends Thread{
    private Baozi bz;

    public Chihuo(String name, Baozi bz) {
        super(name);
        this.bz = bz;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (bz){
                if(bz.flag=false){
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("吃货正在吃"+bz.pier+bz.xianer+"包子");
                bz.flag = false;
                bz.notify();
            }
        }
    }
}
