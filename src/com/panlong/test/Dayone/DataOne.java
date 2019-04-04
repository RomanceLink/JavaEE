package com.panlong.test.Dayone;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/*
*
* tips:在使用println方法时，
* 会自动调用Date类中的toString方法。Date类对Object类中的toString方法进行了
* 覆盖重写，所以结果为指定格式的字符串。
*
* Date类中的多数方法已经过时，常用的方法有：
  - public long getTime() 把日期对象转换成对应的时间毫秒值。



* */
public class DataOne {
    public static void main(String[] args) throws ParseException {
        Date d=new Date();
        System.out.println(d.getTime());//获取毫秒值 1554340285156
        //创建日期对象 获取当前时间
        System.out.println(new Date());//

        //创建日期对象 获取当前毫秒值转成日期对象
        System.out.println(new Date(0L));

        //创建format对象
        Date date=new Date();
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
        /*
        * DateFormat类的常用方法有：
        - public String format(Date date)：将Date对象格式化为字符串。
        - public Date parse(String source)：将字符串解析为Date对象。
*/
        String str=f.format(date);
        System.out.println(str);//2019-04-04

        //parse
        DateFormat f1 = new SimpleDateFormat("yyyy年MM月dd日");
        String str1="2018年12月11日";
        Date date1=f1.parse(str1);
        System.out.println(date1);//Tue Dec 11 00:00:00 CST 2018
    }
}
