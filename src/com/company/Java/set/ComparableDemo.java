package com.company.Java.set;

import java.util.TreeSet;

public class ComparableDemo {

    public static void main(String[] args) {

        TreeSet data = new TreeSet(new MySorting());
        data.add(152);
        data.add(185);
        data.add(254);
        data.add(10);
        data.add(132);
        data.add(10);

        System.out.println(data);
    }
}
