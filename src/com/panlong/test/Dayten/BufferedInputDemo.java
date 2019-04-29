package com.panlong.test.Dayten;

import java.io.*;
import java.util.HashMap;

public class BufferedInputDemo {
    public static void main(String[] args) throws Exception {
     //练习文本排序
        //创建mpa集合 保存文本数据 键为序号 值为文字
        HashMap<String, String> map = new HashMap<>();

        //创建流对象
        BufferedReader br = new BufferedReader(new FileReader("read.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("read1.txt"));

        //读取数据
        String line=null;
        while((line=br.readLine())!=null){
            //解析文本
            String[] split=line.split("\\.");
            //保存到集合
            map.put(split[0],split[1]);
        }

        //释放资源
        br.close();

        //遍历map集合
        for (int i = 1; i <=map.size(); i++) {
            String key=String.valueOf(i);
            //获取map中文本
            String value=map.get(key);

            //写出拼接文本
            bw.write(key+"."+value);
            //写出换行
            bw.newLine();
        }
        bw.close();
    }

    private static void m6() throws IOException {
        BufferedWriter bfw = new BufferedWriter(new FileWriter("read.txt"));
        bfw.write("黑马");
        bfw.newLine();
        bfw.write("程序员");
        bfw.write("sd ");
        bfw.close();
    }

    private static void m5() throws IOException {
        //创建字符缓冲流对象
        BufferedReader bfr = new BufferedReader(new FileReader("read.txt"));
        //定义字符串 保存读取的一行文字
        String line=null;
        //循环读取
        while ((line=bfr.readLine())!=null){
            System.out.println(line);

            System.out.println("========");
        }

        //释放资源
        bfr.close();
    }

    private static void m4() {
        //记录开始时间
        long start=System.currentTimeMillis();
        //创建流对象
        try(
                BufferedInputStream bis=new BufferedInputStream(new FileInputStream("edk.apk"));
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy.apk"));
        ){
            int len;
            byte[] b=new byte[8*1024];
            while ((len = bis.read(b)) != -1) {
                bos.write(b,0,len);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }

        long end=System.currentTimeMillis();
        System.out.println("花费时间"+(end-start)+"毫秒");
    }

    private static void m3() {
        //记录开始时间
        long start=System.currentTimeMillis();
        //创建流对象
        try(
                BufferedInputStream bis=new BufferedInputStream(new FileInputStream("edk.apk"));
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy.apk"));
        ){
            int b;
            while ((b = bis.read()) != -1) {
                bos.write(b);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }

        long end=System.currentTimeMillis();
        System.out.println("花费时间"+(end-start)+"毫秒");
    }

    private static void m2() {
        //记录开始时间
        long start=System.currentTimeMillis();
        try {
            //创建流对象
            FileInputStream fis = new FileInputStream("edk.apk");
            FileOutputStream fos = new FileOutputStream("copy.apk");
            //读写数据
            int b;
            while((b=fis.read())!=-1){
                fos.write(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("普通流时间:"+(end-start)+"毫秒");
    }

    private static void m1() throws FileNotFoundException {
        //创建字节缓冲输入流
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("bis.txt"));
        //创建字节缓冲输流
        new BufferedOutputStream(new FileOutputStream("bos.txt"));
        /*
        * 效率测试
        查询API，缓冲流读写方法与基本的流是一致的，我们通过复制大文件（375MB），测试它的效率。
*/
        //记录开始时间
    }
}
