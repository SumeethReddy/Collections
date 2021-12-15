package com.company.Java.arrayprograms;

public class ContainsASpecificValue {

    public static boolean contains(int[] arr, int item) {
        for (int n : arr) {
            if (item == n) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] my_array = {35645,47345,56467,87438};

        System.out.println(contains(my_array, 35645));
    }

}