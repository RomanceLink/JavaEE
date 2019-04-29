package com.panlong.test.Dayseven;

public class BaoziTest {
    public static void main(String[] args) {
        Baozi bz=new Baozi();
        Chihuo ch = new Chihuo("吃货",bz);
        BaoziPu bzp = new BaoziPu("包子铺",bz);

        ch.start();
        bzp.start();
    }
}
