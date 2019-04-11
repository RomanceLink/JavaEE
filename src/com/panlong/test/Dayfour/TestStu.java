package com.panlong.test.Dayfour;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestStu {
    public static void main(String[] args) {
        //创建集合对象
        HashMap<Student,String> map = new HashMap<>();
        //添加元素
        map.put(new Student("潘龙",23),"上海");
        map.put(new Student("昨天",13),"大海");
        map.put(new Student("今后",223),"临海");
        map.put(new Student("明天",234),"刘海");
        map.put(new Student("明天",234),"刘海");

        //不重写toString 和hashcode就会得不到想要的打印结果
        Set<Map.Entry<Student, String>> en = map.entrySet();
        for (Map.Entry<Student, String> entry : en) {
            System.out.println(entry.getKey()+"="+entry.getValue());
        }
      /*
        - 当给HashMap中存放自定义对象时，如果自定义对象作为key存在，这时要保证对象唯一，必须复写对象的hashCode和equals方法(如果忘记，请回顾HashSet存放自定义对象)。
        - 如果要保证map中存放的key和取出的顺序一致，可以使用java.util.LinkedHashMap集合来存放。
*/

    }
}
