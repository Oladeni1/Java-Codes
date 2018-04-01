package com.MyOwnJavaProj;

/**
 * Created by user on 01/04/2017.
 */
public class DimensionalArray {

    public static void main(String[] args) {

        int row = 4;
        int col = 4;

        String num[][] = new String[row][col]; //string data-type.
        num[0][0] = "Olatunde";
        num[0][1] = "Muideen";
        num[0][2] = "Oladeni";
        num[0][3] = "Presy";

        num[1][0] = "Pharouq";
        num[1][1] = "Noor";
        num[1][2] = "Bukky";
        num[1][3] = "Sunky";

        num[2][0] = "Manchester";
        num[2][1] = "Leeds";
        num[2][2] = "Salford";
        num[2][3] = "Preston";

        num[3][0] = "Nigeria";
        num[3][1] = "Ghana";
        num[3][2] = "America";
        num[3][3] = "Somalia";

        //syntax for (forLoop):(initialization; condition; incremental or decremental)
        for (int i = 0; i < num.length; i++) {
            for (int b = 0; b < num[i].length; b++) {

                System.out.println(num[i][b]);

            }
            System.out.println("==========================");
            }

        System.out.println("This is Dimensional Array");
        }

    }

