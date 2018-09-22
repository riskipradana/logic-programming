package com.company;

public class JustTry {

    static int b = func();
    static int c = funck();
    static int a = 90;

    private static int func() {
        return a;
    }
    private static int funck() {
        return a;
    }

    public static void main(String[] args) {
        System.out.println(b);//0
        System.out.println(c);//0
    }
}
