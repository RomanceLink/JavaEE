package com.panlong.test.Daythree;

import java.util.LinkedList;

public class Linkedlist1 {
    public static void main(String[] args) {
        LinkedList<String> link = new LinkedList<>();

        //添加元素 到首部
        link.addFirst("111");
        link.addFirst("222");
        link.addFirst("333");
        System.out.println(link);

        //获取元素  分别获取头部和尾部元素
        System.out.println(link.getFirst());
        System.out.println(link.getLast());

        //删除元素 分别删除头部和尾部元素 返回元素
        System.out.println(link.removeFirst());
        System.out.println(link.removeLast());

        //判断集合是否为空
        while(!link.isEmpty()){
            //弹出集合中栈顶元素
            System.out.println(link.pop());
        }

        System.out.println(link);
    }
}
