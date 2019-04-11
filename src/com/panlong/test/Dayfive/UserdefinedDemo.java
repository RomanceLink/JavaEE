package com.panlong.test.Dayfive;
/*
*     3.2 自定义异常的练习

    要求：我们模拟登陆操作，如果用户名已存在，则抛出异常并提示：亲，该用户名已经被注册。

    首先定义一个登陆异常类LoginException：*/
public class UserdefinedDemo {
private static String[] names={"bill","hill","jill"};

    public static void main(String[] args) {
        try {
            checkUsername("bill");
            System.out.println("注册成功");//没有异常则会执行
        } catch (LoginException e) {
            e.printStackTrace();
        }

    }

    public static boolean checkUsername(String uname) throws LoginException{
        for (String name : names) {
            if(name.equals(uname)){
                throw  new LoginException("亲"+name+"已经被注册了!");
            }
        }
        return true;
    }

}
