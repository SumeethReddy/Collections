package com.company.Java.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {

        HashMap<String, Integer> marks = new HashMap(); // Initial capacity = 16 and load factor = 0.16

        marks.put("Science", 90);
        marks.put("Maths", 100);
        marks.put("English", 90);
        marks.put("FB", 100);
        marks.put("Ea", 76);
        marks.put(null, 99);

        System.out.println(marks.get("Ea"));
        System.out.println(marks);
        System.out.println(marks.entrySet());
        System.out.println(marks.clone());
        System.out.println(marks.containsKey("FB"));
        System.out.println(marks.remove("FB"));
    }
}
