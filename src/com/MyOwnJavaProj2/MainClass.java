package com.MyOwnJavaProj2;

/**
 * Created by user on 04/04/2017.
 */
public class MainClass {

    public static void main(String[] args){

        //Calling static method from main class

        StaticClass.sum();

        int ans = StaticClass.sum();

        System.out.println(ans); //returns 50.

        StaticClass.multiply(); //returns 625.

        System.out.println("Static method");

        System.out.println("==============================");

        //Calling Non-static method from the main class

        NonStaticClass nsc = new NonStaticClass();

        System.out.println(nsc.subtract()); // returns 100.

        nsc.addition(); //returns 150.

        System.out.println("Non-Static method");


    }

}
