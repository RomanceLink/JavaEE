package com.panlong.test.Daytwo;

public class ArrayList1<E> {//定义泛型类
    //使用泛型 即 什么时候确定泛型
    public boolean add(E e){
        return false;
    }

    public void get(int index){  }
    /*
    * 1.在场景对象的时候确定泛型
    * 例如 ArrayList<String> list=new ArrayList<String>();
    * public boolean add(String e){ }

      public String get(int index){  }
    *
    *再例如，ArrayList<Integer> list = new ArrayList<Integer>();

     此时，变量E的值就是Integer类型,那么我们的类型就可以理解为：

    * public boolean add(Integer e) { }

      public Integer get(int index) {  }
    *
    *
    * */
}
