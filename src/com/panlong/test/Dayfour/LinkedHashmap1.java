package com.panlong.test.Dayfour;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/*
* 1.8   LinkedHashMap
我们知道HashMap保证成对元素唯一，并且查询速度很快，可是成对元素存放进去是没有顺序的，那么我们要保证有序，还要速度快怎么办呢？
在HashMap下面有一个子类LinkedHashMap，它是链表和哈希表组合的一个数据存储结构。
*/
public class LinkedHashmap1 {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> lmap = new LinkedHashMap<>();
        lmap.put(1,"李白");
        lmap.put(3,"杜甫");
        lmap.put(5,"朱九真");
        lmap.put(2,"蓝猫");

        Set<Map.Entry<Integer, String>> en = lmap.entrySet();
        for (Map.Entry<Integer, String> entry : en) {
            System.out.println(entry.getKey()+"="+entry.getValue());
        }
    }
}
