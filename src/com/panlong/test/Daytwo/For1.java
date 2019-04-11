package com.panlong.test.Daytwo;

import java.util.ArrayList;
import java.util.Collection;

public class For1 {
    public static void main(String[] args) {
        int[] arr={1,2,3,43,5,65,7,};
        //使用增强for遍历数组
        for (int i : arr) {//i代表数组中的每个元素
            System.out.println(i);
        }

        Collection<String> list = new ArrayList<>();
        list.add("小和尚");
        list.add("老和尚");
        list.add("大和尚");

        for (String s : list) {
            System.out.println(s);
        }

        //tips: 新for循环必须有被遍历的目标。目标只能是Collection或者是数组。
        // 新式for仅仅作为遍历操作出现。
    }
}
