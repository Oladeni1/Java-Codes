package com.MyOwnJavaProj;

import java.util.ArrayList;

/**
 * Created by user on 01/04/2017.
 */
public class MyStringArrayList {

    public static void main (String[] args){

        //Declaring object od ArrayList for Integer
        ArrayList<String> alist = new ArrayList<String>();

        //Storing String values
        alist.add("Manchester"); //index here is 0.
        alist.add("South Africa");
        alist.add("Leeds");
        alist.add("Abuja FCT");
        alist.add("Preston");
        alist.add("Nigeria");
        alist.add("America");
        alist.add("Ghana");

        //initialisation
        for(int i=0; i<alist.size(); i++){

            //Printing list of values
            System.out.println(alist.get(i));

        }
        int valueIndex = alist.indexOf("Manchester");

        //Printing index value for String -"Manchester",this should return 0.
        System.out.println("Index of Manchester =" +valueIndex);

    }
}
