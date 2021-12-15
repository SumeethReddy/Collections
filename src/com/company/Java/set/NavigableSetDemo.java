package com.company.Java.set;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetDemo {
    public static void main(String[] args) {

        NavigableSet<Integer> data = new TreeSet<>();
        data.add(1000);
        data.add(2000);
        data.add(3000);
        data.add(15000);
        data.add(39000);

        System.out.println("-----Tree Set----");

        //Methods

        System.out.println(data.floor(13550));

    }
}
