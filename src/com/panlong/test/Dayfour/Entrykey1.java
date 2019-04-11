package com.panlong.test.Dayfour;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*1.5  Entry键值对对象

我们已经知道，Map中存放的是两种对象，一种称为key(键)，一种称为value(值)，它们在在Map中是一一对应关系，这一对对象又称做Map中的一个Entry(项)。Entry将键值对的对应关系封装成了对象。即键值对对象，这样我们在遍历Map集合时，就可以从每一个键值对（Entry）对象中获取对应的键与对应的值。
 既然Entry表示了一对键和值，那么也同样提供了获取对应键和对应值得方法：
- public K getKey()：获取Entry对象中的键。
- public V getValue()：获取Entry对象中的值。

在Map集合中也提供了获取所有Entry对象的方法：
- public Set<Map.Entry<K,V>> entrySet(): 获取到Map集合中所有的键值对对象的集合(Set集合)。

1.6 Map集合遍历键值对方式
键值对方式：即通过集合中每个键值对(Entry)对象，获取键值对(Entry)对象中的键与值。
操作步骤与图解：
1. 获取Map集合中，所有的键值对(Entry)对象，以Set集合形式返回。方法提示:entrySet()。
2. 遍历包含键值对(Entry)对象的Set集合，得到每一个键值对(Entry)对象。
3. 通过键值对(Entry)对象，获取Entry对象中的键与值。  方法提示:getkey() getValue()
*/
public class Entrykey1 {
    public static void main(String[] args) {
        //创建map集合对象
        HashMap<String,String> map = new HashMap<>();

        //添加元素到集合
        map.put("1","改拜年");
        map.put("2","脆弱");
        map.put("3","看着你");
        map.put("4","燃烧");


        //获取所有键值对对象
        Set<Map.Entry<String, String>> en = map.entrySet();
        for (Map.Entry<String, String> entry : en) {
            System.out.println(entry.getKey()+"="+entry.getValue());
        }
        //tips：Map集合不能直接使用迭代器或者foreach进行遍历。但是转成Set之后就可以使用了。

    }
}
