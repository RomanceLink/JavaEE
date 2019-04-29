package com.panlong.test.Dayeight;

import java.io.File;

/*
* 第三章 综合案例

3.1 文件搜索
搜索D:\IdeaWork目录中的.java 文件。
分析：
1. 目录搜索，无法判断多少级目录，所以使用递归，遍历所有目录。
2. 遍历目录时，获取的子文件，通过文件名称，判断是否符合条件。
*/
public class FileSearch {
    public static void main(String[] args) {
        File file = new File("D:\\IdeaWork");
        search(file);
    }
    public static void search(File file){
        File[] files = file.listFiles();
        for (File file1 : files) {
            if(file1.isFile()&&file1.getName().endsWith(".java")){
                    System.out.println(file1.getName());
            }
            if(file1.isDirectory()){
                search(file1);
            }
        }
    }
}
