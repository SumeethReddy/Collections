package com.company.Java.list;

import java.util.Collection;
import java.util.Vector;

public class VectorDemo {

    public static void main(String[] args) {

        Vector v = new Vector();

        Vector v1 = new Vector(60);

        Vector vec1 = new Vector(100,5);

       /* Vector vec2 = new Vector(Collection c);*/

        v.add(10);
        v.add("Sai");
        v.add(false);
        System.out.println(v);

      //  v.remove(1);
        System.out.println(v.elementAt(2));

        System.out.println(v.size());
        System.out.println(vec1.capacity());


    }
}
