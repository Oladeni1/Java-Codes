package com.MyOwnJavaProj2;

/**
 * Created by user on 04/04/2017.
 */
public class StaticClass {

    static int a = 25;
    static int b = 25;

    public static int sum(){
        int c = a + b;
        return c;
    }

    public static void multiply(){
        int d = a * b;

       System.out.println(d);
    }
}
