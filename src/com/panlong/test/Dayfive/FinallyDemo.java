package com.panlong.test.Dayfive;

import java.io.FileNotFoundException;

public class FinallyDemo {
    public static void main(String[] args) {
        try {
            read("a.txt");
        } catch (FileNotFoundException e) {
            //抓取到的是编译期异常  抛出去的是运行期
            throw new RuntimeException(e);
        } finally {
            System.out.println("不管程序怎样，这里都将会被执行。");
        }
        System.out.println("over");
    }
    /*
     *
     * 我们 当前的这个方法中 有异常  有编译期异常
     */
    public static void read(String path) throws FileNotFoundException {
        if (!path.equals("a.txt")) {//如果不是 a.txt这个文件
            // 我假设  如果不是 a.txt 认为 该文件不存在 是一个错误 也就是异常  throw
            throw new FileNotFoundException("文件不存在");
        }
    }
    /*2.5   异常注意事项

- 运行时异常被抛出可以不处理。即不捕获也不声明抛出。
- 如果父类抛出了多个异常,子类覆盖父类方法时,只能抛出相同的异常或者是他的子集。
- 父类方法没有抛出异常，子类覆盖父类该方法时也不可抛出异常。此时子类产生该异常，只能捕获处理，不能声明抛出
- 当多异常处理时，捕获处理，前边的类不能是后边类的父类
- 在try/catch后可以追加finally代码块，其中的代码一定会被执行，通常用于资源回收。
- 如果finally有return语句,永远返回finally中的结果,避免该情况.
*/
}
