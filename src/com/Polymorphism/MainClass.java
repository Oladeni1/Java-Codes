package com.Polymorphism;

/**
 * Created by user on 05/04/2017.
 */
public class MainClass {

    //Executing Mypolymorphism from main class

    public static void main(String[] args){

        Mypolymorphism poly = new Mypolymorphism();

        //Calling method1
        System.out.println(poly.add(5, 3));

        //Calling method2
        System.out.println(poly.add(5 , 3 , 2));

        //calling method3
        System.out.println(poly.add(5 , 3 ));

        //Calling method4
        System.out.println(poly.add(7 , 6));

        }
}
