package com.panlong.test.Daysix;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TicketDemo implements Runnable{
    private int ticket=100;
    Lock lock=new ReentrantLock();
    @Override
    public void run() {
        while (true){
            lock.lock();
            if(ticket>0){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(Thread.currentThread().getName()+"正在卖"+ticket--);
            }
            lock.unlock();
        }
    }
    //String look=new String();

//    @Override
//    public void run() {
//        while (true){
//          this.look();
//
//          if(ticket<=0){
//              break;
//          }
//        }
//    }
//
//    public synchronized void look(){
//        if(ticket>0){
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println(Thread.currentThread().getName()+"线程"+ticket--);
//        }
//    }
//    @Override
//    public void run() {
//        //窗口永久开启
//        while(true){
//            synchronized(look){
//                if (ticket > 0) {
//                    try {
//                        Thread.sleep(100);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    System.out.println(Thread.currentThread().getName() + "正在卖" + ticket--);
//                }
//            }
//            if (ticket<=0){
//                break;
//            }
//        }
//
//    }
}
