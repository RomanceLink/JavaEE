package com.panlong.test.Daytwo;

import java.util.ArrayList;
import java.util.Collection;

/*通配符基本使用

泛型的通配符:不知道使用什么类型来接收的时候,此时可以使用?,?表示未知通配符。
此时只能接受数据,不能往该集合中存储数据。
举个例子大家理解使用即可：
*/
public class GenericNom {
    public static void main(String[] args) {
        Collection<Integer> list1 = new ArrayList<Integer>();
        getElement(list1);
        Collection<String> list2 = new ArrayList<String>();
        getElement(list2);
    }
    public static void getElement(Collection<?> coll){}
    //？代表可以接收任意类型
    //tips:泛型不存在继承关系 Collection<Object> list = new ArrayList<String>();这种是错误的。
}
