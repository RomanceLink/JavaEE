package com.panlong.test.Daytwo;
/*
*
* - 集合：集合是java中提供的一种容器，可以用来存储多个数据。
   集合和数组既然都是容器，它们有啥区别呢？
        - 数组的长度是固定的。集合的长度是可变的。
        - 数组中存储的是同一类型的元素，可以存储基本数据类型值。集合存储的都是对象。而且对象的类型可以不一致。在开发中一般当对象多的时候，使用集合进行存储。

集合按照其存储结构可以分为两大类，分别是单列集合java.util.Collection和双列集合java.util.Map.

Collection：单列集合类的根接口，用于存储一系列符合某种规则的元素，它有两个重要的子接口，分别是java.util.List和java.util.Set。
其中，List的特点是元素有序、元素可重复。Set的特点是元素无序，而且不可重复。List接口的主要实现类有java.util.ArrayList和java.util.LinkedList，Set接口的主要实现类有java.util.HashSet和java.util.TreeSet。


Collection是所有单列集合的父接口，因此在Collection中定义了单列集合(List和Set)通用的一些方法，这些方法可用于操作所有的单列集合。方法如下：
        - public boolean add(E e)：  把给定的对象添加到当前集合中 。
        - public void clear() :清空集合中所有的元素。
        - public boolean remove(E e): 把给定的对象在当前集合中删除。
        - public boolean contains(E e): 判断当前集合中是否包含给定的对象。
        - public boolean isEmpty(): 判断当前集合是否为空。
        - public int size(): 返回集合中元素的个数。
        - public Object[] toArray(): 把集合中的元素，存储到数组中。


第二章 Iterator迭代器
2.1 Iterator接口
在程序开发中，经常需要遍历集合中的所有元素。针对这种需求，JDK专门提供了一个接口java.util.Iterator。Iterator接口也是Java集合中的一员，但它与Collection、Map接口有所不同，Collection接口与Map接口主要用于存储元素，而Iterator主要用于迭代访问（即遍历）Collection中的元素，因此Iterator对象也被称为迭代器。

下面介绍一下迭代的概念：
        - 迭代：即Collection集合元素的通用获取方式。在取元素之前先要判断集合中有没有元素，如果有，就把这个元素取出来，继续在判断，如果还有就再取出出来。一直把集合中的所有元素全部取出。这种取出方式专业术语称为迭代。
        - 想要遍历Collection集合，那么就要获取该集合迭代器完成迭代操作，下面介绍一下获取迭代器的方法：
          - public Iterator iterator(): 获取集合对应的迭代器，用来遍历集合中的元素的。

Iterator接口的常用方法如下：
        - public E next():返回迭代的下一个元素。
        - public boolean hasNext():如果仍有元素可以迭代，则返回 true。

*
* 2.2 迭代器的实现原理

我们在之前案例已经完成了Iterator遍历集合的整个过程。当遍历集合时，首先通过调用t集合的iterator()方法获得迭代器对象，然后使
用hashNext()方法判断集合中是否存在下一个元素，如果存在，则调用next()方法将元素取出，否则说明已到达了集合末尾，停止遍历元素。
Iterator迭代器对象在遍历集合时，内部采用指针的方式来跟踪集合中的元素，为了让初学者能更好地理解迭代器的工作原理，接下来通过
一个图例来演示Iterator对象迭代元素的过程：

在调用Iterator的next方法之前，迭代器的索引位于第一个元素之前，不指向任何元素，当第一次调用迭代器的next方法后，迭代器的索
引会向后移动一位，指向第一个元素并将该元素返回，当再次调用next方法时，迭代器的索引会指向第二个元素并将该元素返回，依此类
推，直到hasNext方法返回false，表示到达了集合的末尾，终止对元素的遍历。

2.3 增强for

增强for循环(也称for each循环)是JDK1.5以后出来的一个高级for循环，专门用来遍历数组和集合的。它的内部原理其实是个Iterator迭
代器，所以在遍历的过程中，不能对集合中的元素进行增删操作。

格式：

    for(元素的数据类型  变量 : Collection集合or数组){
      	//写操作代码
    }

它用于遍历Collection和数组。通常只进行遍历元素，不要在遍历的过程中对集合元素进行增删操作。

第三章 泛型

3.1  泛型概述
在前面学习集合时，我们都知道集合中是可以存放任意对象的，只要把对象存储集合后，那么这时他们都会被提升成Object类型。当我们在取出每一个对象，并且进行相应的操作，这时必须采用类型转换。
Collection虽然可以存储各种对象，但实际上通常Collection只存储同一类型对象。例如都是存储字符串对象。因此在JDK5之后，新增了泛型(Generic)语法，让你在设计API时可以指定类或方法支持泛型，
这样我们使用API的时候也变得更为简洁，并得到了编译时期的语法检查。

- 泛型：可以在类或方法中预支地使用未知的类型。

tips:一般在创建对象时，将未知的类型确定具体的类型。当没有指定泛型时，默认类型为Object类型。

3.2  使用泛型的好处

上一节只是讲解了泛型的引入，那么泛型带来了哪些好处呢？

- 将运行时期的ClassCastException，转移到了编译时期变成了编译失败。
- 避免了类型强转的麻烦。

3.3  泛型的定义与使用
我们在集合中会大量使用到泛型，这里来完整地学习泛型知识。
泛型，用来灵活地将数据类型应用到不同的类、方法、接口当中。将数据类型作为参数进行传递。
定义和使用含有泛型的类
定义格式：
    修饰符 class 类名<代表泛型的变量> {  }

3.4  泛型通配符
当使用泛型类或者接口时，传递的数据中，泛型类型不确定，可以通过通配符<?>表示。但是一旦使用泛型的通配符后，
只能使用Object类中的共性方法，集合中元素自身方法无法使用。
通配符基本使用
泛型的通配符:不知道使用什么类型来接收的时候,此时可以使用?,?表示未知通配符。
此时只能接受数据,不能往该集合中存储数据。

通配符高级使用----受限泛型

之前设置泛型的时候，实际上是可以任意设置的，只要是类就可以设置。但是在JAVA的泛型中可以指定一个泛型的上限和下限。

泛型的上限：

- 格式： 类型名称 <? extends 类 > 对象名称
- 意义： 只能接收该类型及其子类

泛型的下限：

- 格式： 类型名称 <? super 类 > 对象名称
- 意义： 只能接收该类型及其父类型



* */
public class Collection1 {
    public static void main(String[] args) {

    }
}
