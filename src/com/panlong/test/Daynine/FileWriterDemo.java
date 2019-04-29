package com.panlong.test.Daynine;

import javafx.scene.media.SubtitleTrack;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) throws Exception {

        // 使用文件名称创建流对象
        FileWriter fw = new FileWriter("read.txt");
        // 写出数据，通过flush
        fw.write('刷'); // 写出第1个字符
        fw.flush();
        fw.write('新'); // 继续写出第2个字符，写出成功
        fw.flush();

        // 写出数据，通过close
        fw.write('关'); // 写出第1个字符
        fw.close();
        fw.write('闭'); // 继续写出第2个字符,【报错】java.io.IOException: Stream closed
        fw.close();

    }

    private static void m1() throws IOException {
        //基本写出数据
        //写出字符：write(int b) 方法，每次可以写出一个字符数据

        //使用文件名称创建流对象
        FileWriter fw = new FileWriter("read.txt");
        //写出数据
        fw.write(97);
        fw.write("你好");
        fw.write('c');
        fw.write(3000);


        //关闭资源  与FileOutputStream不同
        //如果不关闭 数据只是保存到缓冲区  并未保存到文件
        fw.close();
  /*
  * 小贴士：

1. 虽然参数为int类型四个字节，但是只会保留一个字符的信息写出。
2. 未调用close方法，数据只是保存到了缓冲区，并未写出到文件中。
*/

       /* 闭和刷新

        因为内置缓冲区的原因，如果不关闭输出流，无法写出字符到文件中。但是关闭的流对象，是无法继续写出数据的。如果我们既想写出数据，又想继续使用流，就需要flush 方法了。

        - flush ：刷新缓冲区，流对象可以继续使用。
        - close ：关闭流，释放系统资源。关闭前会刷新缓冲区。*/
    }
}
