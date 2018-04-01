package com.Polymorphism;

/**
 * Created by user on 05/04/2017.
 */
public class Mypolymorphism {

    // Concept of overloading(Polymorphism):Two or mor methods of the same name But differ arguments/parameters.

    //Method1
    public int add(int a, int b) {
        int c = a + b;
        return c;
    }

    //method2
    public int add(int a , int b , int d){
        int e = a + b + d;
        return e;

    }
     // method3
    public int add(double w , int d){
        int z = (int)w + d;       //(int) here is called "Casting"
        return z;

    }
     // method4
    public int add(int a ,double b ){
        int e = a + (int)b;
        return e;

    }

     }

