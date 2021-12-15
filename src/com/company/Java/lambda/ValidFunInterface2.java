package com.company.Java.lambda;

@FunctionalInterface
public interface ValidFunInterface2 {
    public void method1();

    //Default Method
    default void method2(){

    }
    //Static Method
    static void method3(){

    }
}
