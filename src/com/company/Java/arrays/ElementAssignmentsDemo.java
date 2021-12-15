package com.company.Java.arrays;

public class ElementAssignmentsDemo {

    public static void main(String[] args) {
        int[] a = new int[3];
        float[] y = new float[2];


        Object[] objArray = new Object[5];
        objArray[0] = new Object();
        objArray[1] = new String();


        Number[] numArray = new Number[3];
        numArray[0] = new Integer(1);
        numArray[1] = new Byte("2");


        Runnable[] r = new Runnable[5];
        r[0] = new Thread();
        System.out.println(r[1]);
    }
}
