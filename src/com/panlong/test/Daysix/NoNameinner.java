package com.panlong.test.Daysix;

public class NoNameinner {
    public static void main(String[] args) {
//        new Runnable(){
////            public void run(){
////                for (int i = 0; i < 20; i++) {
////                    System.out.println("张宇"+i);
////                }
////            }
////        };

        Runnable r=new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println("张宇"+i);
                }
            }
        };

        new Thread(r).start();

        for (int i = 0; i < 20; i++) {
            System.out.println("费玉清"+i);
        }
    }
}
