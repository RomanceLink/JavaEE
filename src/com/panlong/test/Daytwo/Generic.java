package com.panlong.test.Daytwo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
* 3.2  使用泛型的好处

上一节只是讲解了泛型的引入，那么泛型带来了哪些好处呢？

- 将运行时期的ClassCastException，转移到了编译时期变成了编译失败。
- 避免了类型强转的麻烦。
*/
public class Generic {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("abc");
        list.add("itcast");
        //list.add(5);当集合明确类型时  存放不一致会报错

        Iterator<String> it= list.iterator();
        while (it.hasNext()){
            String str=it.next();
            System.out.println(str.length());
        }
      //tips:泛型是数据类型的一部分，我们将类名与泛型合并一起看做数据类型。
    }
    /*
    * 含有泛型的方法
定义格式：
    修饰符 <代表泛型的变量> 返回值类型 方法名(参数){  }
例如，
*/
    public class MyGenericMethod {
        public <MVP> void show(MVP mvp) {
            System.out.println(mvp.getClass());
        }

        public <MVP> MVP show2(MVP mvp) {
            return mvp;
        }
    }

        //使用格式：调用方法时，确定泛型的类型
    /*
    *   // 创建对象
        MyGenericMethod mm = new MyGenericMethod();
        // 演示看方法提示
        mm.show("aaa");
        mm.show(123);
        mm.show(12.45);*/
}
