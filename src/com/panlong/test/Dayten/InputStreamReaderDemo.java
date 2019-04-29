package com.panlong.test.Dayten;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

/*
* 2.3 InputStreamReader类
转换流java.io.InputStreamReader，是Reader的子类，是从字节流到字符流的桥梁。它读取字节，并使用指定的字符集将其解码为字符。它的字符集可以由名称指定，也可以接受平台的默认字符集。
构造方法
- InputStreamReader(InputStream in): 创建一个使用默认字符集的字符流。
- InputStreamReader(InputStream in, String charsetName): 创建一个指定字符集的字符流。

构造举例，代码如下：
    InputStreamReader isr = new InputStreamReader(new FileInputStream("in.txt"));
    InputStreamReader isr2 = new InputStreamReader(new FileInputStream("in.txt") , "GBK");
指定编码读取
*/
public class InputStreamReaderDemo {
    public static void main(String[] args) throws Exception {
        //定义文件路径  文件为gbk编码
        String FileName="read.txt";
        //创建流对象  默认UTF8编码
        //InputStreamReader isp = new InputStreamReader(new FileInputStream(FileName));
        //创建流对象 指定GBK编码
        InputStreamReader isp1 = new InputStreamReader(new FileInputStream(FileName), "GBK");

        //定义变量  保存字符
        int read;
       /* //使用默认编码字符流读取对象 乱码
        while((read= isp.read())!=-1){
            System.out.println((char)read);
        }
       isp.close();*/

       //使用指定编码字符流读取 正常解析
        while((read=isp1.read())!=-1){
            System.out.println((char)read);
        }
        isp1.close();
    }
}
