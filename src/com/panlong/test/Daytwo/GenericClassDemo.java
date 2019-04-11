package com.panlong.test.Daytwo;

public class GenericClassDemo {
    public static void main(String[] args) {
        // 创建一个泛型为String的类
        MyGenericClass<String> my = new MyGenericClass<String>();
        // 调用setMVP
        my.setMVP("大胡子登登");
        // 调用getMVP
        String mvp = my.getMVP();
        System.out.println(mvp);
        //创建一个泛型为Integer的类
        MyGenericClass<Integer> my2 = new MyGenericClass<Integer>();
        my2.setMVP(123);
        Integer mvp2 = my2.getMVP();
    }
}
