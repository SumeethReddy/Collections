package com.company.Java.arrays;

public class ArraysDemo {

    public static void main(String[] args) {


    int[] x;

    int[] y = {1,2,3,4,5};

        int[] e = new int[5];

        int []w;
        int[][] q;
        int []f, g[];

        int[] z = new int[3];
        System.out.println(z[0]);
        System.out.println(z[1]);
        System.out.println(z[2]);

        z[0] = 10;
        z[1] = 12;
        z[2] = 14;

        for (int ele : z){
            System.out.println(ele);
        }

        System.out.println(z);

        int[][] b =new int[2][];
        b[0] =  new int[2];
        b[1] =  new int[3];

        b[0][0] = 55;
        System.out.println(b[0][0]);

        int[][] c = {{2,5,6},{3,4}};

        for (int[] array: c){
            for (int ele : array){
                System.out.println(ele);
            }
        }

    }


}
