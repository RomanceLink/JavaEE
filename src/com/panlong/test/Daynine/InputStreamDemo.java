package com.panlong.test.Daynine;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStreamDemo {
    public static void main(String[] args) throws Exception {
        /*
        * 错误数据d，是由于最后一次读取时，只读取一个字节e，数组中，上次读取的数据没有被完全替换
        * ，所以要通过len ，获取有效的字节，代码使用演示：*/

        //使用文件名称创建流对象
        FileInputStream fis = new FileInputStream("read.txt");

        //定义变量 作为有效个数
        int len;
        //定义字节数组  作为装字节数组的容器
        byte[] b=new byte[2];
        //循环读取
        while ((len=fis.read(b))!=-1){
            //每次读取后 把数组的有效字节部分  变成字符串打印
            System.out.println(new String(b,0,len));
        }

        //关闭资源
        fis.close();
        /*
        * 小贴士：
使用数组读取，每次读取多个字节，减少了系统间的IO操作次数，从而提高了读写的效率，建议开发中使用。
*/
    }

    private static void m4() throws IOException {
    /*使用字节数组读取：read(byte[] b)，每次读取b的长度个字节到数组中，
    返回读取到的有效字节个数，读取到末尾时，返回-1 ，代码使用演示：*/

        //使用文件名称创建流对象
        FileInputStream fis = new FileInputStream("read.txt");

        //定义变量 作为有效数据
        int len;
        //定义字节数组  作为装字节的数据的容器
        byte[]  b=new byte[2];
        //循环读取
        while ((len=fis.read(b))!=-1){
            System.out.println(new String(b));
        }

        //关闭资源
        fis.close();
    }

    private static void m3() throws IOException {
        //循环改进
        FileInputStream fis = new FileInputStream("read.txt");
        //定义变量  保存数据
        int b;
        //循环读取
        while((b=fis.read())!=-1){
            System.out.println((char)b);
        }

        //关闭资源
        fis.close();
        /*小贴士：

1. 虽然读取了一个字节，但是会自动提升为int类型。
2. 流操作完毕后，必须释放系统资源，调用close方法，千万记得。
*/
    }

    private static void m2() throws IOException {
    /*读取字节数据
1. 读取字节：read方法，每次可以读取一个字节的数据，提升为int类型，读取到文件末尾，返回-1，代码使用演示：
*/
        //使用文件名称创建流对象
        FileInputStream fis = new FileInputStream("read.txt");
        //读取数据 返回一个字节
        int read=fis.read();
        System.out.println((char)read);

        //读到末尾 返回-1
        read=fis.read();
        System.out.println(read);

        //关闭资源
        fis.close();
    }

    private static void m1() throws FileNotFoundException {
    /*2.5 FileInputStream类

java.io.FileInputStream类是文件输入流，从文件中读取字节。

构造方法

- FileInputStream(File file)： 通过打开与实际文件的连接来创建一个 FileInputStream ，该文件由文件系统中的 File对象 file命名。
- FileInputStream(String name)： 通过打开与实际文件的连接来创建一个 FileInputStream ，该文件由文件系统中的路径名 name命名。

当你创建一个流对象时，必须传入一个文件路径。该路径下，如果没有该文件,会抛出FileNotFoundException 。
*/

        //使用File对象创建流对象
        File file = new File("a.txt");
        FileInputStream fs = new FileInputStream(file);

        //使用文件名创建流对象
        FileInputStream fis = new FileInputStream("b.txt");
    }
}
