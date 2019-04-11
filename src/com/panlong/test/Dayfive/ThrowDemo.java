package com.panlong.test.Dayfive;

public class ThrowDemo {
    public static void main(String[] args) {
        //创建一个数组
        int[] arr={2,3,4,56,5};
        //根据索引找对应元素
        int index =-1;
        int element=getElement(arr,index);
        System.out.println(element);
        System.out.println("over");
    }

    public static int getElement(int[] arr,int index){
        //判断 索引是否越界
        if(index<0||index>arr.length-1){
            //判断条件如果满足  当执行完throw抛出异常对象后 方法已经无法继续运算
            //这时就会结束当前方法的执行  并将异常告知调用者  这时就需要通过异常来解决
            throw new ArrayIndexOutOfBoundsException("数组越界了  大哥");
        }
        int element=arr[index];
        return element;
        /*
        * 注意：如果产生了问题，我们就会throw将问题描述类即异常进行抛出，也就是将问题返回给该方法的调用者。
         那么对于调用者来说，该怎么处理呢？一种是进行捕获处理，另一种就是继续讲问题声明出去，使用throws声明处理。

*/
    }
}
