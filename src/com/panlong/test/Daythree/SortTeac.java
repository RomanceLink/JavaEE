package com.panlong.test.Daythree;

import java.util.ArrayList;
import java.util.Collections;

public class SortTeac {
    public static void main(String[] args) {
        ArrayList<Teacher> list = new ArrayList<>();
        list.add(new Teacher("李白",12));
        list.add(new Teacher("杜甫",23));
        list.add(new Teacher("白居易",14));
        list.add(new Teacher("李牧",32));

        //如果没有实现Comparable接口就会报错
        //因为默认规则无法为Teacher类型排序
        Collections.sort(list);

        for (Teacher t : list) {
            System.out.println(t);
        }
    }
}
