package com.panlong.test.Daysix;

public class Mythread extends Thread{
    public Mythread(String name){
        super(name);
    }


    //重写run方法 定义要执行的代码
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            //getname()方法 来自父类
            System.out.println(getName()+"线程执行了"+i);
        }
    }
}
