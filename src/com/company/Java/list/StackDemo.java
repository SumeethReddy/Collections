package com.company.Java.list;

import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {

        Stack s = new Stack();
        s.push(10);
        s.push(30);
        s.push(true);

        Object a = s.pop();

        //Object o = s.pop();
        System.out.println(s);

        Object obj = s.peek();
    }
}
