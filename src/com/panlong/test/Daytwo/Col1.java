package com.panlong.test.Daytwo;

import java.util.ArrayList;
import java.util.Collection;

/*
*       - public boolean add(E e)：  把给定的对象添加到当前集合中 。
        - public void clear() :清空集合中所有的元素。
        - public boolean remove(E e): 把给定的对象在当前集合中删除。
        - public boolean contains(E e): 判断当前集合中是否包含给定的对象。
        - public boolean isEmpty(): 判断当前集合是否为空。
        - public int size(): 返回集合中元素的个数。
        - public Object[] toArray(): 把集合中的元素，存储到数组中。
* 功能演示*/
public class Col1 {
    public static void main(String[] args) {
        //创建集合对象
        Collection<String> col=new ArrayList<>();

        //添加
        col.add("张无忌");
        col.add("周芷若");
        col.add("小昭");
        col.add("赵敏");
        System.out.println(col);

        //判断O是否在集合中存在
        System.out.println("判断  张无忌是否在集合中"+col.contains("张无忌"));

        //删除在集合中O元素
        System.out.println("删除周芷若"+col.remove("周芷若"));
        System.out.println("操作之后集合中元素"+col);

        //size（）集合中有几个元素
        System.out.println("集合中有"+col.size()+"个元素");

        //Object[] toArray()转换成一个Object成一个Object数组
        Object[] objects = col.toArray();

        //遍历数组
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);
        }

        //void clear() 清空集合
        col.clear();
        System.out.println("集合中内容为:"+col);

        //isEmpty() 判断是否为空
        System.out.println(col.isEmpty());


    }
}
