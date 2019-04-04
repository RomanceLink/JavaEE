package com.panlong.test.Dayone;
/*
*4.3 构造方法

根据StringBuilder的API文档，常用构造方法有2个：

- public StringBuilder()：构造一个空的StringBuilder容器。
- public StringBuilder(String str)：构造一个StringBuilder容器，并将字符串添加进去。

 */
public class StringBd {
    public static void main(String[] args) {
        //构造容器 无参
        StringBuilder sb1=new StringBuilder();
        System.out.println(sb1);//空白

        //有参
        StringBuilder sb2 = new StringBuilder("你好");
        System.out.println(sb2);//你好;
        /*4.4 常用方法

StringBuilder常用的方法有2个：

- public StringBuilder append(...)：添加任意类型数据的字符串形式，并返回当前对象自身。
- public String toString()：将当前StringBuilder对象转换为String对象。

append方法

append方法具有多种重载形式，可以接收任意类型的参数。任何数据作为参数都会将对应的字符串内容添加到StringBuilder中。例如：
*/
        //备注：StringBuilder已经覆盖重写了Object当中的toString方法。


        //创建对象
        StringBuilder builder = new StringBuilder();
        //public StringBuilder append(任意类型)
        StringBuilder builder2 = builder.append("hello");
        //对比一下
        System.out.println("builder:"+builder);
        System.out.println("builder2:"+builder2);
        System.out.println(builder == builder2); //true
        // 可以添加 任何类型
        builder.append("hello");
        builder.append("world");
        builder.append(true);
        builder.append(100);
        // 在我们开发中，会遇到调用一个方法后，返回一个对象的情况。然后使用返回的对象继续调用方法。
        // 这种时候，我们就可以把代码现在一起，如append方法一样，代码如下
        //链式编程
        builder.append("hello").append("world").append(true).append(100);
        System.out.println("builder:"+builder);

//        备注：StringBuilder已经覆盖重写了Object当中的toString方法。
//
//        toString方法
//
//        通过toString方法，StringBuilder对象将会转换为不可变的String对象。如：

        // 链式创建
        StringBuilder sb3 = new StringBuilder("Hello").append("World").append("Java");
        // 调用方法
        String str = sb3.toString();
        System.out.println(str); // HelloWorldJava
    }
}
