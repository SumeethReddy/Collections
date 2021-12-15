package com.company.Java.lambda;

public class LambdaExample1 {

    public static void main(String[] args) {
       MyFunInterface mf = (a,b) -> System.out.println("Sum of and b is "+ (a+b));
       mf.funMethodAdd(10,20);
    }
}

interface MyFunInterface{
    public void funMethodAdd(int a, int b);
}

/*class CallFunInterface implements MyFunInterface{

    @Override
    public void funMethodAdd(int a, int b) {
        System.out.println("Sum of a and b is :" + (a+b));
    }*/

