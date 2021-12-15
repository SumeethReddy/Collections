package com.company.Java.arrays;

public class VariableAssignments {

    public static void main(String[] args) {

        int[] x = new int[2];
        int[] a = x;

        x[0] = 10;
        a[1] = 2;
        System.out.println(x[0]);
        System.out.println(x[1]);
        System.out.println(a[0]+" "+a[1]);

        int[] b= {1,2,34};
        int[] c = {11,22};

        b=c;
        c=b;
        for (int  ele:b){
            System.out.println(ele);
        }

        for(int ele:c){
            System.out.println(ele);
        }

        String[] s = new String[3];
        Object[] objArray = s;

        short[] shortArray = new short[4];
    }
}
