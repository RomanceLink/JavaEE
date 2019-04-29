package com.panlong.test.Daynine;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class PhotoCopy {
    public static void main(String[] args) throws Exception {
        //1创建流对象
          //指定数据源
        FileInputStream fis = new FileInputStream("1.jpg");

        //指定目的地
        FileOutputStream fos = new FileOutputStream("2.jpg");

        //1读取数据
        //定义数组
        byte[]  b=new byte[1024];
        //定义长度
        int len;
        while ((len=fis.read(b))!=-1){
            fos.write(b,0,len);
        }

        //关闭资源
        fos.close();
        fis.close();
    }
}
