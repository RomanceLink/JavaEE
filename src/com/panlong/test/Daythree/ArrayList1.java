package com.panlong.test.Daythree;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {
    public static void main(String[] args) {
        //创建list集合对象
        List<String> list = new ArrayList<>();

        //往尾部添加 指定元素
        list.add("图图");
        list.add("小美");
        list.add("不高兴");

        System.out.println(list);
        //add（int index,String s）往指定位置添加
        list.add(1,"没头脑");

        System.out.println(list);

        //String remove(int index)删除指定位置元素 返回被删除元素
        //删除索引位置为2的元素
        System.out.println("删除索引位置为2的元素");
        System.out.println(list.remove(2));

        System.out.println(list);

        //String set(int index,String s)
        //在指定位置 进行 元素替代(改)
        //修改指定位置元素
        list.set(0,"三毛");
        System.out.println(list);

        //String get(int index) 获取指定位置元素


        //跟size()方法一起用  来遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        //还可以使用增强for
        for (String s : list) {
            System.out.println(s);
        }

        /*tips:我们之前学习Colletion体系的时候，发现List集合下有很多集合，它们的存储结构不同，
        这样就导致了这些集合它们有各自的特点，
        供我们在不同的环境下使用，那么常见的数据结构有哪些呢？在下一章我们来介绍：*/
    }
}
