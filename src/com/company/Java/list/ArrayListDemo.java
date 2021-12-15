package com.company.Java.list;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList al = new ArrayList();

        ArrayList aList = new ArrayList(30);

        //ArrayList aListNew = new ArrayList(Collection c);

        al.add("John");
        al.add(true);
        al.add(123);

       // al.remove(1);
        al.remove(new String("John"));
        System.out.println(al.get(1));

        ArrayList<String> arrayList = new ArrayList<String>();

        System.out.println(al);

    }
}
