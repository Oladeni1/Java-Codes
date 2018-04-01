package com.MyOwnJavaProj;

import java.util.ArrayList;

/**
 * Created by user on 01/04/2017.
 */
public class MyIntegerArrayList {

    public static void main (String[] args){

        //Declaring object od ArrayList for Integer
        ArrayList<Integer> alist = new ArrayList<Integer>();

        //Storing integer values
        alist.add(1);
        alist.add(2);
        alist.add(3);
        alist.add(4);
        alist.add(5);
        alist.add(6); //index here is 5.
        alist.add(7);
        alist.add(8);

        //initialisation
        for(int i=0; i<alist.size(); i++){

            //Printing list of values
            System.out.println(alist.get(i));

        }
        int valueIndex = alist.indexOf(6);

        //printing index number for integer value 6, this should return 5
        System.out.println(("Index of 6 =" +valueIndex));

    }
}
