package com.panlong.test.Dayten;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

/*
* 2.4 OutputStreamWriter类

转换流java.io.OutputStreamWriter ，是Writer的子类，是从字符流到字节流的桥梁。使用指定的字符集将字符编码为字节。它的字符集可以由名称指定，也可以接受平台的默认字符集。

构造方法

- OutputStreamWriter(OutputStream in): 创建一个使用默认字符集的字符流。
- OutputStreamWriter(OutputStream in, String charsetName): 创建一个指定字符集的字符流。

构造举例，代码如下：

    OutputStreamWriter isr = new OutputStreamWriter(new FileOutputStream("out.txt"));
    OutputStreamWriter isr2 = new OutputStreamWriter(new FileOutputStream("out.txt") , "GBK");

指定编码写出
*/
public class OutputStreamDemo {
    public static void main(String[] args) throws Exception {
        OutputStreamWriter osp = new OutputStreamWriter(new FileOutputStream("read.txt"));
        osp.write("你好");
        osp.close();
    }
}
