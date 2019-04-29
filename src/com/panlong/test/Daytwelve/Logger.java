package com.panlong.test.Daytwelve;

public class Logger {
    private static void log(int level,String msg){
        if(level==1){
            System.out.println(msg);
        }
    }

    public static void main(String[] args) {
        String msgA="Hello";
        String msgB="World";
        String msgC="Java";

        long s=System.currentTimeMillis();
        log(2,msgA+msgB+msgC);//不管level是否满足 都会拼接字符串
        long t=System.currentTimeMillis();

        System.out.println(t-s);
        /*
        * 这段代码存在问题：无论级别是否满足要求，作为log方法的第二个参数，三个字符串一定会首先被拼接并传入方法内，
        * 然后才会进行级别判断。如果级别不符合要求，那么字符串的拼接操作就白做了，存在性能浪费。*/
    }
}
