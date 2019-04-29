package com.panlong.test.Dayeight;
/*
2.4 递归打印多级目录
分析：多级目录的打印，就是当目录的嵌套。遍历之前，无从知道到底有多少级目录，所以我们还是要使用递归实现。
* */

import java.io.File;

public class FilePrintDemo {
    public static void main(String[] args) {
        File file = new File("D:\\IdeaWork");

       printFile(file);


    }
    public static void printFile(File file){

        File[] files = file.listFiles();

        for (File file1 : files) {
            if(file1.isFile()){
                System.out.println("文件名:"+file1.getAbsolutePath());
            }else {
                System.out.println("目录:"+file1.getAbsolutePath());
                printFile(file1);
            }
        }
    }
}
