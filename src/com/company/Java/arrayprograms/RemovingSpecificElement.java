package com.company.Java.arrayprograms;

import java.util.Arrays;

public class RemovingSpecificElement {

    public static void main(String[] args) {

        int[] arr = {22,43,54,675,54};

        int item = 1;

        for (int i = item; i< arr.length-1; i++){
            arr[i] = arr[i+1];
        }
        System.out.println(Arrays.toString(arr));
    }
}
