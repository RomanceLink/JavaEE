package com.panlong.test.Daytwelve;

public class ProveLam {
    private static void log(int level, MsgBuild builder) {
        if (level == 1) {
            System.out.println(builder.builMessage());
        }
    }

    public static void main(String[] args) {
        String msgA = "Hello";
        String msgB = "World";
        String msgC = "Java";

        log(2, () -> {
            System.out.println("Lambda执行！");
            return msgA + msgB + msgC;
        });
    }
}
