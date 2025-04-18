package com.izeye.helloworld;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        boolean flag = false;
        int foo = 0;
        // A compile error is triggered by the Error Prone.
//        int x = flag ? foo : null;
    }
}