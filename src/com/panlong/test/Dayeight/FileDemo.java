package com.panlong.test.Dayeight;

import java.io.File;
import java.io.IOException;

/*
* 第一章 File类

1.1 概述
java.io.File 类是文件和目录路径名的抽象表示，主要用于文件和目录的创建、查找和删除等操作。
1.2 构造方法
- public File(String pathname) ：通过将给定的路径名字符串转换为抽象路径名来创建新的 File实例。
- public File(String parent, String child) ：从父路径名字符串和子路径名字符串创建新的 File实例。
- public File(File parent, String child) ：从父抽象路径名和子路径名字符串创建新的 File实例。

小贴士：
1. 一个File对象代表硬盘中实际存在的一个文件或者目录。
2. 无论该路径下是否存在文件或者目录，都不影响File对象的创建。


1.3 常用方法
获取功能的方法
- public String getAbsolutePath() ：返回此File的绝对路径名字符串。
- public String getPath() ：将此File转换为路径名字符串。
- public String getName()  ：返回由此File表示的文件或目录的名称。
- public long length()  ：返回由此File表示的文件的长度。

绝对路径和相对路径
- 绝对路径：从盘符开始的路径，这是一个完整的路径。
- 相对路径：相对于项目目录的路径，这是一个便捷的路径，开发中经常使用。


判断功能的方法
- public boolean exists() ：此File表示的文件或目录是否实际存在。
- public boolean isDirectory() ：此File表示的是否为目录。
- public boolean isFile() ：此File表示的是否为文件。


创建删除功能的方法
- public boolean createNewFile() ：当且仅当具有该名称的文件尚不存在时，创建一个新的空文件。
- public boolean delete() ：删除由此File表示的文件或目录。
- public boolean mkdir() ：创建由此File表示的目录。
- public boolean mkdirs() ：创建由此File表示的目录，包括任何必需但不存在的父目录。

1.4 目录的遍历
- public String[] list() ：返回一个String数组，表示该File目录中的所有子文件或目录。
- public File[] listFiles() ：返回一个File数组，表示该File目录中的所有的子文件或目录。

小贴士：
调用listFiles方法的File对象，表示的必须是实际存在的目录，否则返回null，无法进行遍历。

*/
public class FileDemo {
    public static void main(String[] args) throws IOException {

    }

    private static void m5() {
        File file = new File("D:\\IdeaWork");

        //获取当前目录下的文件以及文件夹名称
        String[] name=file.list();
        for (String s : name) {
            System.out.println(s);
        }

        //获取当前目录下的文件以及文件夹对象 只要拿到了文件对象 那么就可以获得更多信息
        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println(file1);
        }
    }

    private static void m4() throws IOException {
        //文件的创建
        File file = new File("panlong.txt");
        System.out.println("是否存在:"+file.exists());
        System.out.println("是否创建:"+file.createNewFile());
        System.out.println("是否存在:"+file.exists());

        //目录的创建
        File newDir = new File("newDir");
        System.out.println("是否存在:"+newDir.exists());
        System.out.println("是否创建:"+newDir.mkdir());
        System.out.println("是否存在:"+newDir.exists());

        //创建多级目录
        System.out.println("创建多级目录:"+new File("newDira\\newDirb\\newdirc").mkdirs());

        //文件删除
        System.out.println("删除文件:"+file.delete());

        //目录删除
        System.out.println("删除目录:"+new File("newDira\\newDirb\\newdirc").delete());
    }

    private static void m3() {
        File file = new File("D:\\aaa\\bbb.java");
        File file1 = new File("D:\\aaa");

        //判断是否存在
        System.out.println("D:\\aaa\\bbb.java:"+file.exists());
        System.out.println("D:\\aaa:"+file1.exists());

        //判断是文件还是目录
        System.out.println("D:\\aaa 文件?"+file1.isFile());
        System.out.println("D:\\aaa 目录?"+file1.isDirectory());
    }

    private static void m2() {
        // D盘下的bbb.java文件 从盘符开始
        File f = new File("D:\\bbb.java");
        System.out.println(f.getAbsolutePath());

        // 项目下的bbb.java文件
        File f2 = new File("bbb.java");
        System.out.println(f2.getAbsolutePath());
    }

    private static void m1() {
        //文件路径名
        String pathname="D:\\aaa.txt";
        File file = new File(pathname);

        String pathname2="D:\\aaa\\bbb.txt";
        File file1 = new File(pathname2);

        //通过父路径 和子路径字符串
        String parent="D:\\aaa";
        String child="bbb.txt";
        File file2 = new File(parent, child);

        //通过父级File对象和子路径字符串
        File parentDir = new File("D:\\aaa");
        String child1="bbb.txt";
        File file3 = new File(parentDir, child1);

        System.out.println(file);
        System.out.println(file1);
        System.out.println(file2);
        System.out.println(file3);

        System.out.println("绝对路径"+file3.getAbsolutePath());
        System.out.println("相对路径"+file3.getPath());
        System.out.println("文件名称"+file3.getName());
        System.out.println("文件长度"+file3.length());//字节码大小
        /*
        * API中说明：length()，表示文件的长度。但是File对象表示目录，则返回值未指定。
        *
        *
        * */
    }
}
