package com.company.Java.set;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

    public static void main(String[] args) {

        LinkedHashSet lhs = new LinkedHashSet();
        LinkedHashSet lhs2 = new LinkedHashSet(30);
        LinkedHashSet lhs3 = new LinkedHashSet(100, 1.00f);

        lhs.add("Huhu");
        lhs.add("huhu");
        System.out.println(lhs);
    }
}
