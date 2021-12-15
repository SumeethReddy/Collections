package com.company.Java.map;

import java.util.IdentityHashMap;

public class IdentityHashMapDeom {

    public static void main(String[] args) {

        IdentityHashMap<Integer, String> m = new IdentityHashMap<>();
        Integer a = new Integer(10);
        Integer b = new Integer(10);
        m.put(a, "First");
        m.put(b,   "Second");
        System.out.println(m);
    }
}
