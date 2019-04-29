package com.panlong.test.Dayeight;
/*
* 第二章 递归
2.1 概述
- 递归：指在当前方法内调用自己的这种现象。

2.2 递归累和
计算1 ~ n的和
分析：num的累和 = num + (num-1)的累和，所以可以把累和的操作定义成一个方法，递归调用。
小贴士：递归一定要有条件限定，保证递归能够停止下来，次数不要太多，否则会发生栈内存溢出。


2.3 递归求阶乘
- 阶乘：所有小于及等于该数的正整数的积。
    n的阶乘：n! = n * (n-1) *...* 3 * 2 * 1
分析：这与累和类似,只不过换成了乘法运算，学员可以自己练习，需要注意阶乘值符合int类型的范围。
    推理得出：n! = n * (n-1)!


*/
public class RecurrenceDemo {
    public static void main(String[] args) {
      double n=1000;
      //数字太大会溢出
      double value=getValue(n);
        System.out.println("阶乘为:"+value);
    }
    public static double getValue(double n){
        if(n==1){
            return  1;
        }else{
            return n*getValue(n-1);
        }
    }

    private static void m1() {
        //计算1-num的和 使用递归完成
        int num=2;
        //调用求和方法
        int sum=getSum(num);
        System.out.println(sum);
    }

    public static int getSum(int num){
        //分析 num为2是 传入方法 判断 num不为2  就会执行else里的代码
        //num 为2  加上  方法参数减1  因为getSum(1)会返回1,所以此时
        //就会返回num+1也就是3
        if(num==1){
            return 1;
        }else{
            return num+getSum(num-1);
        }
    }

}
