package com.panlong.test.Daytwelve;

public class Loglambda {
    private static void log(int level,MsgBuild builder){
        if(level==1){
            System.out.println(builder.builMessage());
        }
    }

    public static void main(String[] args) {
        String msgA="hello";
        String msgB="world";
        String msgC="java";

        long s=System.currentTimeMillis();
        log(2,()->msgA+msgB+msgC);//而lambda又延迟性  先将level传进log方法判断
        //然后才会执行下一步
        long t=System.currentTimeMillis();

        System.out.println(t-s);
    }
}
