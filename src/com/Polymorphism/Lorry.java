package com.Polymorphism;

/**
 * Created by user on 05/04/2017.
 */

  //Inheritance concept

public class Lorry {
     int wheel = 4;
     int boot = 1;
     int wipper = 3;
     int mirrow = 3;
     String fuel = "Gas";
     String colour = "Black";

     public String getFuel() {
          return "Gas";

     }
          protected void seats(){

          int seats = 4;

          System.out.println("seats total is" + seats);
     }


     public void showdetails() {
     }
}



