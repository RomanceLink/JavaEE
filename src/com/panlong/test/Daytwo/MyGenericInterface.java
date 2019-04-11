package com.panlong.test.Daytwo;
/*
* 含有泛型的接口

定义格式：

    修饰符 interface接口名<代表泛型的变量> {  }

例如，
*/
public interface MyGenericInterface<E>{
    public abstract void add(E e);

    public abstract E getE();
}

/*
* 使用格式：

1、定义类时确定泛型的类型

例如

public class MyImp1 implements MyGenericInterface<String> {
	@Override
    public void add(String e) {
        // 省略...
    }

	@Override
	public String getE() {
		return null;
	}
}

此时，泛型E的值就是String类型。



2、始终不确定泛型的类型，直到创建对象时，确定泛型的类型
 例如
    public class MyImp2<E> implements MyGenericInterface<E> {
    	@Override
    	public void add(E e) {
           	 // 省略...
    	}

    	@Override
    	public E getE() {
    		return null;
    	}
    }
确定泛型：
      使用

public class GenericInterface {
    public static void main(String[] args) {
        MyImp2<String>  my = new MyImp2<String>();
        my.add("aa");
    }
}
*/
