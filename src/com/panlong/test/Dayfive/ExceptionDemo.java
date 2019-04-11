package com.panlong.test.Dayfive;

public class ExceptionDemo {
    public static void main(String[] args) {
        int[] arr = { 34, 12, 67 };
        int num = ArrayTools.getElement(arr, 3);//数组越界
        System.out.println("num=" + num);
        System.out.println("over");
    }
}
