package com.panlong.test.Daytwelve;

public class DefineLam {
    private  static void doSome(MyFun inter){//定义一个方法 把接口作为参数传进来
        inter.myMethod();//调用自定义函数式接口
    }

    public static void main(String[] args) {
        //调用使用函数式接口的方法
        doSome(()-> System.out.println("Lambda执行啦"));
    }
}
