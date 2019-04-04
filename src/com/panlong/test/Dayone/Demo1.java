package com.panlong.test.Dayone;
/*
* 第一章 Object类
*   java.lang.Object类是语言中的根类  即所有类的父类  所有方法子类都可使用
*   对象实例化的时候  最终找到的就是Object
*
*      如果类没有特别指定父类  默认就是继承Object类
*      public class MyClass /*extends Object
*      {
*     ...........
*     }
*
*     Object 类当中包含方法11个
*     此处学习其中两个
*       - public String toString()：返回该对象的字符串表示。
        - public boolean equals(Object obj)：指示其他某个对象是否与此对象“相等”。

*java.util.Objects类
*     在JDK7添加了一个Objects工具类，它提供了一些方法来操作对象，它由一些静态的实用方法组成，这些方法是null-save（空指针安全的）或null-tolerant（容忍空指针的），用于计算对象的hashcode、返回对象的字符串表示形式、比较两个对象。

在比较两个对象的时候，Object的equals方法容易抛出空指针异常，而Objects类中的equals方法就优化了这个问题。方法如下：

- public static boolean equals(Object a, Object b):判断两个对象是否相等。

我们可以查看一下源码，学习一下：
   public static boolean equals(Object a, Object b) {
    return (a == b) || (a != null && a.equals(b));
}

第二章 日期时间类
    java.util.Date类 表示特定的瞬间，精确到毫秒。
        - public Date()：分配Date对象并初始化此对象，以表示分配它的时间（精确到毫秒）。
        - public Date(long date)：分配Date对象并初始化此对象，以表示自从标准基准时间（称为“历元（epoch）”，即1970年1月1日00:00:00 GMT）以来的指定毫秒数。

        tips: 由于我们处于东八区，所以我们的基准时间为1970年1月1日8时0分0秒。

DateFormat类

java.text.DateFormat 是日期/时间格式化子类的抽象类，我们通过这个类可以帮我们完成日期和文本之间的转换,也就是可以在Date对象与String对象之间进行来回转换。

- 格式化：按照指定的格式，从Date对象转换为String对象。
- 解析：按照指定的格式，从String对象转换为Date对象。

构造方法

由于DateFormat为抽象类，不能直接使用，所以需要常用的子类java.text.SimpleDateFormat。这个类需要一个模式（格式）来指定格式化或解析的标准。构造方法为：

- public SimpleDateFormat(String pattern)：用给定的模式和默认语言环境的日期格式符号构造SimpleDateFormat。

参数pattern是一个字符串，代表日期时间的自定义格式。

格式规则

常用的格式规则为：

  标识字母（区分大小写）	含义
  y          	年
  M          	月
  d          	日
  H          	时
  m          	分
  s          	秒

备注：更详细的格式规则，可以参考SimpleDateFormat类的API文档。

2.4 Calendar类

概念

        java.util.Calendar是日历类，在Date后出现，替换掉了许多Date的方法。该类将所有可能用到的时间信息封装为静态成员变量，方便获取。日历类就是方便获取各个时间属性的。

        获取方式

        Calendar为抽象类，由于语言敏感性，Calendar类在创建对象时并非直接创建，而是通过静态方法创建，返回子类对象，如下：

        Calendar静态方法

        - public static Calendar getInstance()：使用默认时区和语言环境获得一个日历

第三章 System类

java.lang.System类中提供了大量的静态方法，可以获取与系统相关的信息或系统级操作，在System类的API文档中，常用的方法有：

- public static long currentTimeMillis()：返回以毫秒为单位的当前时间。
- public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)：将数组中指定的数据拷贝到另一个数组中。


第四章 StringBuilder类

4.1 字符串拼接问题

由于String类的对象内容不可改变，所以每当进行字符串拼接时，总是会在内存中创建一个新的对象。例如：
public class StringDemo {
    public static void main(String[] args) {
        String s = "Hello";
        s += "World";
        System.out.println(s);//"HelloWorld"
    }
}

在API中对String类有这样的描述：字符串是常量，它们的值在创建后不能被更改。

根据这句话分析我们的代码，其实总共产生了三个字符串，即"Hello"、"World"和"HelloWorld"。引用变量s首先指向Hello对象，最终指向拼接出来的新字符串对象，即HelloWord 。
由此可知，如果对字符串进行拼接操作，每次拼接，都会构建一个新的String对象，既耗时，又浪费空间。为了解决这一问题，可以使用java.lang.StringBuilder类。


4.2 StringBuilder概述

查阅java.lang.StringBuilder的API，StringBuilder又称为可变字符序列，它是一个类似于 String 的字符串缓冲区，通过某些方法调用可以改变该序列的长度和内容。

原来StringBuilder是个字符串的缓冲区，即它是一个容器，容器中可以装很多字符串。并且能够对其中的字符串进行各种操作。

它的内部拥有一个数组用来存放字符串内容，进行字符串拼接时，直接在数组中加入新内容。StringBuilder会自动维护数组的扩容。原理如下图所示：(默认16字符空间，超过自动扩充)


* */
public class Demo1 {
    public static void main(String[] args) {

    }
}
