package com.company.Java.set;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {
    public static void main(String[] args) {

        SortedSet s = new TreeSet();
        s.add(10);
        s.add(14);
        s.add(3);
        s.add(30);
        s.add(4);
        s.add(17);
        System.out.println(s);
        //gives first element
        System.out.println(s.first());
        //gives last element
        System.out.println(s.last());
        //SortedSet headSet(Object o) -> gives the elements present before o
        System.out.println(s.headSet(10));
        //SortedSet tailSet(Object o) -> gives the elements present after o including it
        System.out.println(s.tailSet(10));
        //SortedSet subSet(Object o, Object p)
        System.out.println(s.subSet(10, 30));
        //Comparator comparator
        System.out.println(s.comparator());
    }
}
