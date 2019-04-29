package com.panlong.test.Daysix;

public class TicketTest {
    public static void main(String[] args) {
        TicketDemo tc=new TicketDemo();
        Thread t1 = new Thread(tc,"窗口1");
        Thread t2 = new Thread(tc,"窗口2");
        Thread t3 = new Thread(tc,"窗口3");

        t1.start();
        t2.start();
        t3.start();
/*
* 发现程序出现了两个问题：

1. 相同的票数,比如5这张票被卖了两回。
2. 不存在的票，比如0票与-1票，是不存在的。

这种问题，几个窗口(线程)票数不同步了，这种问题称为线程不安全。

线程安全问题都是由全局变量及静态变量引起的。若每个线程中对全局变量、静态变量只有读操作，而无写操作，一般来说，这个全局变量是线程安全的；若有多个线程同时执行写操作，一般都需要考虑线程同步，否则的话就可能影响线程安全。
*/
    }
}
