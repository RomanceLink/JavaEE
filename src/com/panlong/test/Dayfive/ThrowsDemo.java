package com.panlong.test.Dayfive;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsDemo {
    public static void main(String[] args) throws FileNotFoundException,IOException{
       read("a.txt");
    }
    //throws用于进行异常类的声明，若该方法可能有多种异常情况产生，那么在throws后面可以写多个异常类，用逗号隔开。

    public static void read(String path) throws FileNotFoundException,IOException{
        if(!path.equals("a.txt")){
            //如果不是a.txt这个文件
            throw  new FileNotFoundException("文件不存在");
        }
        if(!path.equals("b.txt")){
            throw new IOException();
        }
    }
}
