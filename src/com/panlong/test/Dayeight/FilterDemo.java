package com.panlong.test.Dayeight;

import java.io.File;
import java.io.FileFilter;

/*
* 3.2 文件过滤器优化
java.io.FileFilter是一个接口，是File的过滤器。 该接口的对象可以传递给File类的listFiles(FileFilter fileFilter) 作为参数， 接口中只有一个方法。
boolean accept(File pathname) ：测试pathname是否应该包含在当前File目录中，符合则返回true。
分析：
1. 接口作为参数，需要传递子类对象，重写其中方法。我们选择匿名内部类方式，比较简单。
2. accept方法，参数为File，表示当前File下所有的子文件和子目录。保留住则返回true，过滤掉则返回false。保留规则：
   1. 要么是.java文件。
   2. 要么是目录，用于继续遍历。
3. 通过过滤器的作用，listFiles(FileFilter)返回的数组元素中，子文件对象都是符合条件的，可以直接打印。
*/
public class FilterDemo {
    public static void main(String[] args) {
        File file = new File("D://IdeaWork");
        printDir(file);
    }
    public static void printDir(File dir){
//        File[] files=dir.listFiles(new FileFilter() {
//            @Override
//            public boolean accept(File pathname) {
//             return pathname.getName().endsWith(".jpg")||pathname.isDirectory();
//            }
//        });

        //Lambda 优化
        File[] files=dir.listFiles(pathname->{return pathname.getName().endsWith(".java")||pathname.isDirectory();});

        for (File file : files) {
            if(file.isFile()){
                System.out.println("文件名:"+file.getAbsolutePath());
            }else{
                printDir(file);
            }
        }
    }
}
