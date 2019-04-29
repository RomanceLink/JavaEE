package com.panlong.test.Daynine;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Properties;
import java.util.Set;

/*
* */
public class PropertiesDemo {
    public static void main(String[] args) throws Exception {
        //创建属性集对象
        Properties pro = new Properties();
        InputStreamReader isr2 = new InputStreamReader(new FileInputStream("1.txt") , "utf-8");
        //加载文本中信息到属性集
        pro.load(isr2);
        //遍历集合打印
        Set<String> key = pro.stringPropertyNames();
        for (String s : key) {
            System.out.println(s+"--"+pro.getProperty(s));
        }
/*小贴士：文本中的数据，必须是键值对形式，可以使用空格、等号、冒号等符号分隔。*/
    }

    private static void m1() {
        //创建属性集对象
        Properties properties = new Properties();
        //添加键值对元素
        properties.setProperty("filename","a.txt");
        properties.setProperty("length","213144");
        properties.setProperty("location","D:\\a.txt");

        //打印属性集对象
        System.out.println(properties);
        //通过建  获取属性值
        System.out.println(properties.getProperty("filename"));
        System.out.println(properties.getProperty("length"));
        System.out.println(properties.getProperty("location"));


        //遍历属性集 获取所有键的集合
        Set<String> strings = properties.stringPropertyNames();
        //打印键值对
        for (String string : strings) {
            System.out.println(string+"=="+properties.getProperty(string));
        }
    }
}
