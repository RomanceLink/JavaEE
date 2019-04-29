package com.panlong.test.Dayeleven;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        System.out.println("服务器启动 等待连接");
        //创建serverSocket对象 绑定端口
        ServerSocket ss = new ServerSocket(666);
        //结束连接accept方法 返回socket对象
        Socket accept = ss.accept();
        //通过socket获取输入流
        InputStream is = accept.getInputStream();
        //一次性读取数据
        //创建字节数组
        byte[] b = new byte[1024];
        //读取到字节数组中
        int len = is.read(b);
        //解析数组 打印
        String s = new String(b, 0, len);
        System.out.println(s);

        //回写数据
        OutputStream os = accept.getOutputStream();
        os.write("我很好 谢谢".getBytes());

        //关闭资源
        os.close();
        is.close();
        ss.close();

    }
}
