package com.company.Java.arrayprograms;

public class FindingIndex {

    public static void main(String[] args) {

        int[] intArray = {1, 24, 56, 75};
        int item = 24;
        int ele = 0;
        while (ele < intArray.length) {
            if (intArray[ele] == item)
                System.out.println(ele);
             else ele = ele + 1;
        }
    }
    }