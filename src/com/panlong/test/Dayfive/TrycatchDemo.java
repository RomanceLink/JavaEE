package com.panlong.test.Dayfive;

import com.panlong.test.Daythree.SortTeac;

import java.io.FileNotFoundException;

public class TrycatchDemo {
    public static void main(String[] args) {
        try {//当产生异常时  必须有处理方式  要么捕获 要么声明
            read("b.txt");//
            System.out.println("上一句出现异常的地方  这一句则不会执行");
        } catch (FileNotFoundException e) {//括号中需要定义
            //try抛出的是什么异常  在括号中就定义什么异常类型
            e.printStackTrace();
            System.out.println(e);
        }
        System.out.println("over");
    }

    public static void read(String path) throws FileNotFoundException {
        if (!path.equals("a.txt")) {//如果不是 a.txt这个文件
            // 我假设  如果不是 a.txt 认为 该文件不存在 是一个错误 也就是异常  throw
            throw new FileNotFoundException("文件不存在");
        }
    }
}
