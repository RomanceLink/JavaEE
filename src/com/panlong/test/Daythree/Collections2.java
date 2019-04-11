package com.panlong.test.Daythree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Collections2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("cba");
        list.add("bac");
        list.add("cbsa");

        //排序方法  按照第一个单词的降序
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.charAt(0)-o1.charAt(0);
            }
        });
        System.out.println(list);
    }
}
