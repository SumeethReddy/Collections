package com.company.Java.arrays;

public class MultiDimensionalArrays {

    public static void main(String[] args) {


        int[][] x = new int[3][];

        x[0] = new int[3];
        x[1] = new int[1];
        x[2] = new int[3];

        int[][][] y = new int[2][][];
        y[0] = new int[3][];
        y[1] = new int[3][];

        y[0][0] = new int[3];
        y[0][1]= new int[1];
        y[0][2] = new int[2];

        y[1][0] = new int[3];
        y[1][1]= new int[1];
        y[1][2] = new int[2];

        y[0][0][0] = 1;

        int[] z = new int[3];
        z[0] = 12;
        z[1] = 14;
        z[2] = 18;
        System.out.println(z[0]);
        System.out.println(z[1]);
        System.out.println(z[2]);


    }
}
