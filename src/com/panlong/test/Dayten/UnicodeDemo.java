package com.panlong.test.Dayten;


import java.io.FileReader;

public class UnicodeDemo {
    public static void main(String[] args) throws Exception {
       /*
       * 2.2 编码引出的问题
      在IDEA中，使用FileReader 读取项目中的文本文件。由于IDEA的设置，都是默认的UTF-8编码，所以没有任何问题。但是，当读取Windows系统中创建的文本文件时，由于Windows系统的默认是GBK编码，就会出现乱码。
*/
        FileReader fr = new FileReader("read.txt");
        int read;
        while((read=fr.read())!=-1){
            System.out.println((char)read);
        }
        fr.close();
        //那么如何读取GBK编码的文件

    }
}
