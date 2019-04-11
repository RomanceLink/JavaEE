package com.panlong.test.Daythree;

import java.util.ArrayList;
import java.util.Collections;

public class Collections1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        //原来写法
//        list.add(1);
//        list.add(2);
//        list.add(3);
        Collections.addAll(list,13,2234,32,43,5);
        System.out.println(list);
        //采用工具类  完成 往集合中添加元素
        Collections.sort(list);
        System.out.println(list);
        /*代码演示之后 ，发现我们的集合按照顺序进行了排列，可是这样的顺序是采用默认的顺序，如果想要指定顺序那该怎么办呢？
        我们发现还有个方法没有讲，public static <T> void sort(List<T> list，Comparator<? super T> ):将集合中元素按照指定规则排序。接下来讲解一下指定规则的排列。
*/
    }
}
