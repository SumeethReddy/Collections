package com.company.Java.arrayprograms;

public class AverageValues {

    public static void main(String[] args) {

        int[] intArray = {1,4,55,6,7};

        int sum= 0;

        for (int i: intArray
             ) {
            sum= sum + i;

        }

        int len = intArray.length;

        double avg = (double)sum/(double)len;

        System.out.println(avg);
    }
}
