package com.company.Java.arrayprograms;

public class SumOfValuesInArray {

    public static void main(String[] args) {

        Integer[] intArray = {1,3,5,7,8};
        int sum = 0;

        for (int ele : intArray
             ) {

            sum = sum + ele;

        }
        System.out.println(sum);
    }
}
