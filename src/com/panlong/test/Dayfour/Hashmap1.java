package com.panlong.test.Dayfour;

import java.util.HashMap;
import java.util.Set;

public class Hashmap1 {
    public static void main(String[] args) {
        //创建map对象
        HashMap<String, String> map = new HashMap<>();

        //添加元素
        map.put("1","蚂蚁");
        map.put("2","大象");
        map.put("3","高楼");
        map.put("4","大树");
        //重复键  会覆盖键值
        map.put("4","你好");

        System.out.println(map);

        //删除元素
        System.out.println(map.remove("2"));
        System.out.println(map);

        //查看值
        System.out.println(map.get("1"));
        System.out.println(map.get("2"));

        /*
        * tips:
使用put方法时，若指定的键(key)在集合中没有，则没有这个键对应的值，返回null，并把指定的键值添加到集合中；
若指定的键(key)在集合中存在，则返回值为集合中键对应的值（该值为替换前的值），并把指定键所对应的值，替换成指定的新值。
*/
       /* 1.4   Map集合遍历键找值方式

        键找值方式：即通过元素中的键，获取键所对应的值

        分析步骤：

        1. 获取Map中所有的键，由于键是唯一的，所以返回一个Set集合存储所有的键。方法提示:keyset()
        2. 遍历键的Set集合，得到每一个键。
        3. 根据键，获取键所对应的值。方法提示:get(K key)*/

       //获取所有的键
        Set<String> keys = map.keySet();
        //遍历键集合  得到每一个键
        for (String key : keys) {
            //获取值
            String v=map.get(key);
            System.out.println(key+"="+v);
        }

    }
}
