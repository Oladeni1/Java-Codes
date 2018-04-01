package com.MyOwnJavaProj;

/**
 * Created by user on 01/04/2017.
 */
public class MyMethod {
    public static void main (String[] args){

        MyMethod mthd = new MyMethod();  //Creating object

        System.out.println(mthd.sum(25,175));
        }

    int sum(int a, int b){
        int y = b*a;
        return y;

    }

}
