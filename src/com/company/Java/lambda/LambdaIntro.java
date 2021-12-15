package com.company.Java.lambda;

public class LambdaIntro {
    public static void main(String[] args) {
//        CallFunInterface funInter = new CallFunInterface();
//        funInter.funMethod();
        MyFunctionalInterface funInterLambda = () -> System.out.println("Functional Method");
        funInterLambda.funMethod();

    }

}


interface MyFunctionalInterface{
    public void funMethod();
}

/*
class CallFunInterface implements MyFunctionalInterface{

    @Override
    public void funMethod() {
        System.out.println("Functional Method");
    }*/
