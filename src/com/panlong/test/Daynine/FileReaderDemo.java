package com.panlong.test.Daynine;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) throws Exception {
       /*使用字符数组读取：read(char[] cbuf)，
       每次读取b的长度个字符到数组中，返回读取到的有效字符个数，读取到末尾时，返回-1 ，*/

       //使用文件名称创建流对象
        FileReader fr = new FileReader("read.txt");
        //定义变量  保存有效字符个数
        int len;
        //定义字符数组  作为装字符数据的容器
        char[] b=new char[2];
        //循环读取
        while ((len=fr.read(b))!=-1){
            System.out.println(new String(b,0,len));
        }

        //关闭资源
        fr.close();
    }

    private static void m2() throws IOException {
        //使用文件名称创建流对象
        FileReader fr = new FileReader("read.txt");
        //定义变量  保存数据
        int b;
        //循环读取
        while ((b=fr.read())!=-1){
            System.out.println((char)b);
        }
        //关闭资源
        fr.close();
        //小贴士：虽然读取了一个字符，但是会自动提升为int类型。
    }

    private static void m1() throws FileNotFoundException {
        //使用File对象创建流对象
        File file = new File("a.txt");
        FileReader fr = new FileReader(file);

        //使用文件名称创建流对象
        FileReader f = new FileReader("b.txt");
    }
}
