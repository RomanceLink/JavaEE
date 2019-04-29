package com.panlong.test.Dayten;
        /*第三章 序列化

3.1 概述
Java 提供了一种对象序列化的机制。用一个字节序列可以表示一个对象，该字节序列包含该对象的数据、对象的类型和对象中存储的数据等信息。字节序列写出到文件之后，相当于文件中持久保存了一个对象的信息。
反之，该字节序列还可以从文件中读取回来，重构对象，对它进行反序列化。对象的数据、对象的类型和对象中存储的数据信息，都可以用来在内存中创建对象。看图理解序列化：
*/

import java.io.*;

public class SerializableDemo {
    public static void main(String[] args) throws Exception {
       /*
       * 对于JVM可以反序列化对象，它必须是能够找到class文件的类。如果找不到该类的class文件，则抛出一个 ClassNotFoundException 异常。
反序列化操作2
另外，当JVM反序列化对象时，能找到class文件，但是class文件在序列化对象之后发生了修改，那么反序列化操作也会失败，抛出一个InvalidClassException异常。发生这个异常的原因如下：
- 该类的序列版本号与从流中读取的类描述符的版本号不匹配
- 该类包含未知数据类型
- 该类没有可访问的无参数构造方法
Serializable 接口给需要序列化的类，提供了一个序列版本号。serialVersionUID 该版本号的目的在于验证序列化的对象和对应类是否版本匹配。
*/

    }

    private static void m2() {
    /*3.3 ObjectInputStream类
ObjectInputStream反序列化流，将之前使用ObjectOutputStream序列化的原始数据恢复为对象。
构造方法
- public ObjectInputStream(InputStream in)： 创建一个指定InputStream的ObjectInputStream。
反序列化操作1
如果能找到一个对象的class文件，我们可以进行反序列化操作，调用ObjectInputStream读取对象的方法：
- public final Object readObject () : 读取一个对象。
*/
        Read r=null;
        try {
            //创建反序列化流
            FileInputStream fis = new FileInputStream("read.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            //读取一个Read类型的对象
            r=(Read) ois.readObject();
            //释放资源
            ois.close();
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
            return;
        } catch (ClassNotFoundException e) {
            System.out.println("Read类不存在");
            e.printStackTrace();
        }

        //无异常 直接打印输出
        System.out.println("Name:"+r.name);
        System.out.println("Address:"+r.address);
        System.out.println("age:"+r.age);
        System.out.println("eid:"+r.eid);
    }

    private static void m1() {
    /*
    * 3.2 ObjectOutputStream类

java.io.ObjectOutputStream 类，将Java对象的原始数据类型写出到文件,实现对象的持久存储。

构造方法

- public ObjectOutputStream(OutputStream out)： 创建一个指定OutputStream的ObjectOutputStream。

构造举例，代码如下：

    FileOutputStream fileOut = new FileOutputStream("employee.txt");
    ObjectOutputStream out = new ObjectOutputStream(fileOut);

序列化操作

1. 一个对象要想序列化，必须满足两个条件:

- 该类必须实现java.io.Serializable 接口，Serializable 是一个标记接口，不实现此接口的类将不会使任何状态序列化或反序列化，会抛出NotSerializableException 。
- 该类的所有属性必须是可序列化的。如果有一个属性不需要可序列化的，则该属性必须注明是瞬态的，使用transient 关键字修饰。
*/
        Read r=new Read();
        r.name="张山";
        r.address="北清路";
        r.age=20;

        try {
            //创建序列化流对象
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("read.txt"));
            //写出对象
            oos.writeObject(r);
            //释放资源
            oos.close();
            System.out.println("姓名地址已被序列化");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
