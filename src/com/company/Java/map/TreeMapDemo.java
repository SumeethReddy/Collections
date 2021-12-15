package com.company.Java.map;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {

        TreeMap m = new TreeMap();
        TreeMap m1 = new TreeMap(new RevSorting());
        SortedMap sm = new TreeMap() ;
        TreeMap m2 = new TreeMap(sm);

        m.put(23, "");
        m.put(19,"");
        m.put(10, "Basics");
        m.put(11,"Strong");
        System.out.println(m);

        m1.put("John", "");
        m1.put("Mike", "");
        m1.put("Andy", 11);
        m1.put("Bran", 45);
        System.out.println(m1);

    }
}
