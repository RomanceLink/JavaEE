package com.panlong.test.Dayone;

import java.util.Calendar;
import java.util.Date;

/*
* 根据Calendar类的API文档，常用方法有：

- public int get(int field)：返回给定日历字段的值。
- public void set(int field, int value)：将给定的日历字段设置为给定值。
- public abstract void add(int field, int amount)：根据日历的规则，为给定的日历字段添加或减去指定的时间量。
- public Date getTime()：返回一个表示此Calendar时间值（从历元到现在的毫秒偏移量）的Date对象。

Calendar类中提供很多成员常量，代表给定的日历字段：

  字段值         	含义
  YEAR        	年
  MONTH       	月（从0开始，可以+1使用）
  DAY_OF_MONTH	月中的天（几号）
  HOUR        	时（12小时制）
  HOUR_OF_DAY 	时（24小时制）
  MINUTE      	分
  SECOND      	秒
  DAY_OF_WEEK 	周中的天（周几，周日为1，可以-1使用）

get/set方法

get方法用来获取指定字段的值，set方法用来设置指定字段的值，代码使用演示：
*/
public class CalendarOne {
    public static void main(String[] args) {
//        //创建Calendar对象
       Calendar cal = Calendar.getInstance();
        //设置年
        int year=cal.get(Calendar.YEAR);
        //设置月
        int month=cal.get(Calendar.MONTH)+1;//国外规定的月数会少一月
        //设置日
        int dayOfMonth=cal.get(Calendar.DAY_OF_MONTH);

        System.out.println(year + "年" + month + "月" + dayOfMonth + "日");

        //设置日历
        cal.set(Calendar.YEAR, 2020);
        int year1=cal.get(Calendar.YEAR);
        //设置月
        int month1=cal.get(Calendar.MONTH)+1;//国外规定的月数会少一月
        //设置日
        int dayOfMonth1=cal.get(Calendar.DAY_OF_MONTH);

        System.out.println(year1 + "年" + month1 + "月" + dayOfMonth1 + "日");
        //add方法
        //add方法可以对指定日历字段的值进行加减操作，如果第二个参数为正数则加上偏移量，如果为负数则减去偏移量。代码如：
         cal.add(Calendar.DAY_OF_MONTH,2);//加两天
        cal.add(Calendar.YEAR,-3);//减3年
        int year2=cal.get(Calendar.YEAR);
        //设置月
        int month2=cal.get(Calendar.MONTH)+1;//国外规定的月数会少一月
        //设置日
        int dayOfMonth2=cal.get(Calendar.DAY_OF_MONTH);

        System.out.println(year2 + "年" + month2 + "月" + dayOfMonth2 + "日");

        /*getTime方法
        Calendar中的getTime方法并不是获取毫秒时刻，而是拿到对应的Date对象。
*/
        Date time = cal.getTime();
        System.out.println(time);//Thu Apr 06 09:26:09 CST 2017
      /*
      *
      * 小贴士：

     西方星期的开始为周日，中国为周一。

     在Calendar类中，月份的表示是以0-11代表1-12月。

     日期是有大小关系的，时间靠后，时间越大。
*/
    }
}
