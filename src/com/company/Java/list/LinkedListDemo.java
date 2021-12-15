package com.company.Java.list;

import java.util.Collection;
import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList l = new LinkedList();

        //LinkedList l1 = new LinkedList(Collection c);

        l.add("Sumeeth");
        l.add(334);
        l.add(false);
        l.add(null);

        System.out.println(l);
        l.set(1, 13);
        System.out.println(l);
        l.add(2, true);
        System.out.println(l);

        l.removeLast();
        System.out.println(l);
        l.addFirst(12);
        System.out.println(l.get(2));
    }
}
