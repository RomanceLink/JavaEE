package com.panlong.test.Daythree;

import java.util.HashSet;

public class Set1 {
    public static void main(String[] args) {
        //创建set集合
        HashSet<String> set = new HashSet<>();

        //添加元素
        set.add(new String("cba"));
        set.add("abc");
        set.add("bac");
        set.add("cba");

        //遍历
        for (String s : set) {
            System.out.println(s);
        }
     /*tips:根据结果我们发现字符串"cba"只存储了一个，也就是说重复的元素set集合不存储。

1.首先调用该元素的hashCode()方法计算该元素的哈希值

2.判断该哈希值的位置上是否有相同哈希值的元素,

3.如果该位置上没有相同哈希值的元素,就存储

4.如果该位置上有相同的哈希值元素,那么就产生了哈希冲突

5.产生了哈希冲突,接着就会调用元素的equals()方法,去和该位置上的所有元素进行比较,如果没有一个返回true,就存储,
*/
    }
}
