package com.company.Java.set;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {

        HashSet hs = new HashSet();
        HashSet hs1 = new HashSet(30);
        HashSet hs2 = new HashSet(100, .80f);
        ArrayList al = new ArrayList();
        HashSet hs3 = new HashSet(al);
        hs.add("Sumeeth");
        System.out.println(hs);
    }
}
