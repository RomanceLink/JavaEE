package com.panlong.test.Dayten;

public class Read implements java.io.Serializable{
    //加入版本号
    private static final long Version=1L;
    public String name;
    public String address;
    public transient int age;//transient瞬态修饰成员 不会被序列化
    public  int eid;
    public void addressCheck(){
        System.out.println("Address check:"+name+"--"+address+"--"+eid);
    }
}
