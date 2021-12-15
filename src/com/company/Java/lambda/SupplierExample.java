package com.company.Java.lambda;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
    Supplier<String> s= () -> "spajskja";
    System.out.println(s.get());
}
}