package com.panlong.test.Daytwo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
* 接下来我们通过案例学习如何使用Iterator迭代集合中元素：*/
public class Iterator1 {
    public static void main(String[] args) {
        //创建对象
        Collection<String> col=new ArrayList<>();


        //添加元素到集合
        col.add("串串星人");
        col.add("吐槽行人");
        col.add("汪星人");

        //遍历
        //使用迭代器 遍历  每个集合对象都有自己的迭代
        Iterator<String> it = col.iterator();

        //泛型指的是 迭代出 元素的数据类型
        while (it.hasNext()){
            String s=it.next();//获取迭代出的元素
            System.out.println(s);

            //tips:：在进行集合元素取出时，如果集合中已经没有元素了，还继续使用迭代器的next方法，
            //将会发生java.util.NoSuchElementException没有集合元素的错误。
        }

    }
}
