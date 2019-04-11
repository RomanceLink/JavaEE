package com.panlong.test.Daythree;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet1 {
    public static void main(String[] args) {
        LinkedHashSet<String> lset = new LinkedHashSet<>();
        lset.add("333");
        lset.add("111");
        lset.add("222");
        lset.add("444");

        Iterator<String> it = lset.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
