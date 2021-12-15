package com.company.Java.lambda;

public class DoubleColonMethodReference {

    public static void main(String[] args) {
        MyFuncInterface funInter = () -> System.out.println("I am lambda");
        funInter.method1();
    }
    public static void method2(){
        System.out.println("I am not a lambda");
    }

    public void method3(){
        System.out.println("I am a big lambda");
    }
}

interface MyFuncInterface{

    public void method1();
}


class NewCallerClass{
    public static void main(String[] args) {
        MyFuncInterface i = DoubleColonMethodReference :: method2;
        i.method1();

        DoubleColonMethodReference obj = new DoubleColonMethodReference();
        MyFuncInterface f = obj :: method3;
        f.method1();
    }
}