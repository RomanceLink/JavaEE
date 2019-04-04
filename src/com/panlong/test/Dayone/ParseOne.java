package com.panlong.test.Dayone;
/*
* 5.3 基本类型与字符串之间的转换

基本类型转换为String

   基本类型转换String总共有三种方式，查看课后资料可以得知，这里只讲最简单的一种方式：

    基本类型直接与””相连接即可；如：34+""

String转换成对应的基本类型

除了Character类之外，其他所有包装类都具有parseXxx静态方法可以将字符串参数转换为对应的基本类型：

- public static byte parseByte(String s)：将字符串参数转换为对应的byte基本类型。 Byte
- public static short parseShort(String s)：将字符串参数转换为对应的short基本类型。Short
- public static int parseInt(String s)：将字符串参数转换为对应的int基本类型。Integer
- public static long parseLong(String s)：将字符串参数转换为对应的long基本类型。 Long
- public static float parseFloat(String s)：将字符串参数转换为对应的float基本类型。Float
- public static double parseDouble(String s)：将字符串参数转换为对应的double基本类型。Double
- public static boolean parseBoolean(String s)：将字符串参数转换为对应的boolean基本类型。Boolean



注意:如果字符串参数的内容无法正确转换为对应的基本类型，则会抛出java.lang.NumberFormatException异常。
*/
public class ParseOne {
    public static void main(String[] args) {
        //代码使用（仅以Integer类的静态方法parseXxx为例）如：
        //装箱和拆箱
                int num = Integer.parseInt("100");


    }
}
