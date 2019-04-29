package com.panlong.test.Daynine;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamDemo {
    public static void main(String[] args) throws Exception {



    }

    private static void m5() throws IOException {
        //写出换行 windows系统里  换行符是\r\n
        //使用文件名称创建流对象
        FileOutputStream fos = new FileOutputStream("a.txt");
        //定义字节数组
        byte[] words={97,98,99,100,101};
        //遍历数组
        for (int i = 0; i < words.length; i++) {
            //写出一个字节
            fos.write(words[i]);
            //写出一个换行  换行符号转成数组写出
            fos.write("\r\n".getBytes());
        }
        //关闭资源
        fos.close();
    }

    private static void m4() throws IOException {
        //写出指定长度字节数组 write(byte[] b,int off,int len)
        //每次写出从off索引开始  len格字节

        FileOutputStream fos = new FileOutputStream("a.txt",true);
        //字符串转换为字节数组
        byte[] b="abcd".getBytes();
        //写出从索引2开始  2个字节  索引2是c  两个字节是cd
        fos.write(b,2,2);

        //关闭资源
        fos.close();
/*
* 数据追加续写

经过以上的演示，每次程序运行，创建输出流对象，都会清空目标文件中的数据。如何保留目标文件中数据，还能继续添加新数据呢？

- public FileOutputStream(File file, boolean append)： 创建文件输出流以写入由指定的 File对象表示的文件。
- public FileOutputStream(String name, boolean append)： 创建文件输出流以指定的名称写入文件。

这两个构造方法，参数中都需要传入一个boolean类型的值，true 表示追加数据，false 表示清空原有数据。这样创建的输出流对象，就可以指定是否追加续写了
*/
    }

    private static void m3() throws IOException {
        //写出字节数组：write(byte[] b)，每次可以写出数组中的数据
        FileOutputStream fos = new FileOutputStream("a.txt");

        byte[] b={10,23,43,5,45};
        byte[] b2="黑马程序员".getBytes();
        fos.write(b2);

        fos.close();
    }

    private static void m2() throws IOException {
        FileOutputStream fos = new FileOutputStream("a.txt");

        //写出数据  从内存 写出到硬盘保存 叫输出流
        fos.write(97);
        fos.write(109);
        fos.write(98);

        //关闭流资源
        fos.close();
        /*小贴士：

1. 虽然参数为int类型四个字节，但是只会保留一个字节的信息写出。
2. 流操作完毕后，必须释放系统资源，调用close方法，千万记得。
*/
    }

    private static void m1() throws FileNotFoundException {
        //使用file对象创建流对象
        File file = new File("a.txt");
        FileOutputStream fos = new FileOutputStream(file);

        //使用文件名称创建流对象
        FileOutputStream fos1= new FileOutputStream("a.txt");
        //tip 文件存在有内容 则会新建并清空数据
    }
}
