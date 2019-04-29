package com.panlong.test.Daytwelve;

import java.util.Arrays;
import java.util.Comparator;

public class UseLamPara {
    private static void startThread(Runnable task){
        new Thread(task).start();
    }

    private static Comparator<String> newComparator(){
        return (a,b)->b.length()-a.length();
    }
    public static void main(String[] args) {
        startThread(()->{
            System.out.println("线程执行了");
        });

        String[] array={"abc","ab","abcd"};
        System.out.println(Arrays.toString(array));


        Arrays.sort(array,newComparator());
        System.out.println(Arrays.toString(array));
    }
}
