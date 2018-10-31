package com.zmq;

public class commons {
    public static void main(String[] args) {
        try {
            test();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("这是我可是第三方审计的律师费你好文件夹了极了的个bug");
    }

    private static void test() {
        if (true) {
            throw new NullPointerException();
        }
    }
}
