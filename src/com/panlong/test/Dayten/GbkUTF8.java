package com.panlong.test.Dayten;

import java.io.*;

public class GbkUTF8 {
    public static void main(String[] args) throws Exception {
        //1.定义路径
        String srcFile="file_gbk.txt";
        String destFile="file_utf8.txt";

        //创建流对象
        //转换输入流 指定GBK编码
        InputStreamReader gbk = new InputStreamReader(new FileInputStream(srcFile), "GBK");
        //转换输出流 默认utf-8编码
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(destFile), "UTF-8");

        char[] b=new char[1024];
        int len;
        while((len=gbk.read(b))!=-1){
            osw.write(b,0,len);
        }
        //释放资源
        osw.close();
        gbk.close();

    }
}
