package com.panlong.test.Dayten;

import java.io.*;
import java.util.ArrayList;

/*
* 3.4 练习：序列化集合

1. 将存有多个自定义对象的集合序列化操作，保存到list.txt文件中。
2. 反序列化list.txt ，并遍历集合，打印对象信息。
案例分析
1. 把若干学习对象 ，保存到集合中。
2. 把集合序列化。
3. 反序列化读取时，只需要读取一次，转换为集合类型。
4. 遍历集合，可以打印所有的学生信息
*/
public class SerTest {
    public static void main(String[] args) throws Exception {
        //tips 要实现序列化 一定要在对象类里 实现Serializable接口
        Student s1 = new Student("老王", 23);
        Student s2 = new Student("啊咯在", 21);
        Student s3 = new Student("阿瑟东", 34);

        ArrayList<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        //序列化操作
        //serialize(list);
        //反序列化
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("read.txt"));
        //读取对象 强转为ArrayList类型
        ArrayList<Student> list1 = (ArrayList<Student>) ois.readObject();

        for (int i = 0; i < list1.size(); i++) {
            Student s = list1.get(i);
            System.out.println(s.getName()+"--"+s.getAge());
        }
    }
   private  static void serialize(ArrayList<Student> list) throws Exception{
        //创建序列化流
       ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("read.txt"));
       //写出对象
       oos.writeObject(list);
       //释放资源
       oos.close();
   }

}
