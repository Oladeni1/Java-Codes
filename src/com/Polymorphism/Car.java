package com.Polymorphism;

/**
 * Created by user on 05/04/2017.
 */
public class Car extends Lorry {

    //int speed = 70;

    public static void main(String[] args){

        Lorry lory = new Lorry();

        lory.showdetails();

        System.out.println("fuel of lorry ="+lory.getFuel());
        System.out.println("wheels of lorry ="+lory.wheel);
        System.out.println("mirrows of lorry ="+lory.mirrow);
        System.out.println("boot of lorry ="+lory.boot);
        System.out.println("wippers of lorry ="+lory.wipper);
        System.out.println("colour of lorry ="+lory.colour);

    }
    public void showdetails(){

        seats();

    }

}
