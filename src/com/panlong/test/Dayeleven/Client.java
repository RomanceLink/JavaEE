package com.panlong.test.Dayeleven;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/*
* 2.2 Socket类

Socket 类：该类实现客户端套接字，套接字指的是两台设备之间通讯的端点。
构造方法
- public Socket(String host, int port) :创建套接字对象并将其连接到指定主机上的指定端口号。如果指定的host是null ，则相当于指定地址为回送地址。
  小贴士：回送地址(127.x.x.x) 是本机回送地址（Loopback Address），主要用于网络软件测试以及本地机进程间通信，无论什么程序，一旦使用回送地址发送数据，立即返回，不进行任何网络传输。
成员方法

- public InputStream getInputStream() ： 返回此套接字的输入流。
  - 如果此Scoket具有相关联的通道，则生成的InputStream 的所有操作也关联该通道。
  - 关闭生成的InputStream也将关闭相关的Socket。
- public OutputStream getOutputStream() ： 返回此套接字的输出流。
  - 如果此Scoket具有相关联的通道，则生成的OutputStream 的所有操作也关联该通道。
  - 关闭生成的OutputStream也将关闭相关的Socket。
- public void close() ：关闭此套接字。
  - 一旦一个socket被关闭，它不可再使用。
  - 关闭此socket也将关闭相关的InputStream和OutputStream 。
- public void shutdownOutput() ： 禁用此套接字的输出流。
  - 任何先前写出的数据将被发送，随后终止输出流。

构造方法
- public ServerSocket(int port) ：使用该构造方法在创建ServerSocket对象时，就可以将其绑定到一个指定的端口号上，参数port就是端口号。
构造举例，代码如下：
    ServerSocket server = new ServerSocket(6666);
成员方法
- public Socket accept() ：侦听并接受连接，返回一个新的Socket对象，用于和客户端实现通信。该方法会一直阻塞直到建立连接。



2.4 简单的TCP网络程序

TCP通信分析图解

1. 【服务端】启动,创建ServerSocket对象，等待连接。
2. 【客户端】启动,创建Socket对象，请求连接。
3. 【服务端】接收连接,调用accept方法，并返回一个Socket对象。
4. 【客户端】Socket对象，获取OutputStream，向服务端写出数据。
5. 【服务端】Scoket对象，获取InputStream，读取客户端发送的数据。

到此，客户端向服务端发送数据成功。



自此，服务端向客户端回写数据。

6. 【服务端】Socket对象，获取OutputStream，向客户端回写数据。
7. 【客户端】Scoket对象，获取InputStream，解析回写数据。
8. 【客户端】释放资源，断开连接。

*/
public class Client {
    public static void main(String[] args) throws IOException {
        System.out.println("客户端发送数据");
        //创建socket  确定连接到哪里
        Socket client = new Socket("localhost",666);
        //获取流对象 输出流
        OutputStream os = client.getOutputStream();
        //写出数据
        os.write("你好吗 服务器".getBytes());

        //解析回写
        InputStream iss = client.getInputStream();
        byte[] b=new byte[100];
        int len=iss.read(b);
        System.out.println(new String(b,0,len));

        //关闭资源
        iss.close();
        os.close();
        client.close();


    }
}
