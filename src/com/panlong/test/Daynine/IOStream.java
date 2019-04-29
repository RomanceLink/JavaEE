package com.panlong.test.Daynine;
/**
 *
 *第一章 IO概述

 1.1 什么是IO
 生活中，你肯定经历过这样的场景。当你编辑一个文本文件，忘记了ctrl+s ，可能文件就白白编辑了。当你电脑上插入一个U盘，可以把一个视频，拷贝到你的电脑硬盘里。那么数据都是在哪些设备上的呢？键盘、内存、硬盘、外接设备等等。
 我们把这种数据的传输，可以看做是一种数据的流动，按照流动的方向，以内存为基准，分为输入input 和输出output ，即流向内存是输入流，流出内存的输出流。
 Java中I/O操作主要是指使用java.io包下的内容，进行输入、输出操作。输入也叫做读取数据，输出也叫做作写出数据。

 1.2 IO的分类
 根据数据的流向分为：输入流和输出流。
 - 输入流 ：把数据从其他设备上读取到内存中的流。
 - 输出流 ：把数据从内存 中写出到其他设备上的流。

 格局数据的类型分为：字节流和字符流。
 - 字节流 ：以字节为单位，读写数据的流。
 - 字符流 ：以字符为单位，读写数据的流。
 1.3 IO的流向说明图解



 1.4 顶级父类们
 输入流          	          输出流
 字节流 	字节输入流<br />InputStream	字节输出流<br />OutputStream
 字符流 	  字符输入流<br />Reader   	   字符输出流<br />Writer

 第二章 字节流
 2.1 一切皆为字节
 一切文件数据(文本、图片、视频等)在存储时，都是以二进制数字的形式保存，都一个一个的字节，那么传输时一样如此。所以，字节流可以传输任意文件数据。在操作流的时候，我们要时刻明确，无论使用什么样的流对象，底层传输的始终为二进制数据。

 2.2 字节输出流【OutputStream】
 java.io.OutputStream抽象类是表示字节输出流的所有类的超类，将指定的字节信息写出到目的地。它定义了字节输出流的基本共性功能方法。
 - public void close() ：关闭此输出流并释放与此流相关联的任何系统资源。
 - public void flush() ：刷新此输出流并强制任何缓冲的输出字节被写出。
 - public void write(byte[] b)：将 b.length字节从指定的字节数组写入此输出流。
 - public void write(byte[] b, int off, int len) ：从指定的字节数组写入 len字节，从偏移量 off开始输出到此输出流。
 - public abstract void write(int b) ：将指定的字节输出流。

 小贴士：
 close方法，当完成流的操作时，必须调用此方法，释放系统资源。
 2.3 FileOutputStream类
 OutputStream有很多子类，我们从最简单的一个子类开始。
 java.io.FileOutputStream类是文件输出流，用于将数据写出到文件。
 构造方法
 - public FileOutputStream(File file)：创建文件输出流以写入由指定的 File对象表示的文件。
 - public FileOutputStream(String name)： 创建文件输出流以指定的名称写入文件。
 当你创建一个流对象时，必须传入一个文件路径。该路径下，如果没有这个文件，会创建该文件。如果有这个文件，会清空这个文件的数据。

 2.4 字节输入流【InputStream】

 java.io.InputStream抽象类是表示字节输入流的所有类的超类，可以读取字节信息到内存中。它定义了字节输入流的基本共性功能方法。

 - public void close() ：关闭此输入流并释放与此流相关联的任何系统资源。
 - public abstract int read()： 从输入流读取数据的下一个字节。
 - public int read(byte[] b)： 从输入流中读取一些字节数，并将它们存储到字节数组 b中 。

 小贴士：

 close方法，当完成流的操作时，必须调用此方法，释放系统资源。

 第三章 字符流

 当使用字节流读取文本文件时，可能会有一个小问题。就是遇到中文字符时，可能不会显示完整的字符，那是因为一个中文字符可能占用多个字节存储。所以Java提供一些字符流类，以字符为单位读写数据，专门用于处理文本文件。

 3.1 字符输入流【Reader】

 java.io.Reader抽象类是表示用于读取字符流的所有类的超类，可以读取字节信息到内存中。它定义了字节输入流的基本共性功能方法。

 - public void close() ：关闭此流并释放与此流相关联的任何系统资源。
 - public int read()： 从输入流读取一个字符。
 - public int read(char[] cbuf)： 从输入流中读取一些字符，并将它们存储到字符数组 cbuf中 。
 3.2 FileReader类

 java.io.FileReader类是读取字符文件的便利类。构造时使用系统默认的字符编码和默认字节缓冲区。

 小贴士：

 1. 字符编码：字节与字符的对应规则。Windows系统的中文编码默认是GBK编码表。

 idea中UTF-8

 2. 字节缓冲区：一个字节数组，用来临时存储字节数据。

 构造方法

 - FileReader(File file)： 创建一个新的 FileReader ，给定要读取的File对象。
 - FileReader(String fileName)： 创建一个新的 FileReader ，给定要读取的文件的名称。

 当你创建一个流对象时，必须传入一个文件路径。类似于FileInputStream 。

 3.3 字符输出流【Writer】

 java.io.Writer抽象类是表示用于写出字符流的所有类的超类，将指定的字符信息写出到目的地。它定义了字节输出流的基本共性功能方法。

 - public abstract void close() ：关闭此输出流并释放与此流相关联的任何系统资源。
 - public abstract void flush() ：刷新此输出流并强制任何缓冲的输出字符被写出。
 - public void write(int c) ：写出一个字符。
 - public void write(char[] cbuf)：将 b.length字符从指定的字符数组写出此输出流。
 - public abstract void write(char[] b, int off, int len) ：从指定的字符数组写出 len字符，从偏移量 off开始输出到此输出流。
 - public void write(String str) ：写出一个字符串。

 3.4 FileWriter类

 java.io.FileWriter类是写出字符到文件的便利类。构造时使用系统默认的字符编码和默认字节缓冲区。

 构造方法

 - FileWriter(File file)： 创建一个新的 FileWriter，给定要读取的File对象。
 - FileWriter(String fileName)： 创建一个新的 FileWriter，给定要读取的文件的名称。

 当你创建一个流对象时，必须传入一个文件路径，类似于FileOutputStream。


 第五章 属性集

 5.1 概述

 java.util.Properties 继承于Hashtable ，来表示一个持久的属性集。它使用键值结构存储数据，每个键及其对应值都是一个字符串。该类也被许多Java类使用，比如获取系统属性时，System.getProperties 方法就是返回一个Properties对象。

 5.2 Properties类

 构造方法

 - public Properties() :创建一个空的属性列表。

 基本的存储方法

 - public Object setProperty(String key, String value) ： 保存一对属性。
 - public String getProperty(String key) ：使用此属性列表中指定的键搜索属性值。
 - public Set<String> stringPropertyNames() ：所有键的名称的集合。

 *
 *
* */
public class IOStream {
    public static void main(String[] args) {

    }
}
