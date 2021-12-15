package com.company.Java.arrayprograms;

import java.util.Arrays;

public class Sortingarray {
    public static void main(String[] args) {

        String[] strArray = new String[3];
        int[] intArray = {1,3,55,7,99};

        strArray[0] = "Sumeeth";
        strArray[1] = "Ramesh";
        strArray[2] = "Nikith";

        Arrays.sort(strArray);
        System.out.println(Arrays.toString(strArray));

        Arrays.sort(intArray);

        System.out.println(Arrays.toString(intArray));
    }
}
