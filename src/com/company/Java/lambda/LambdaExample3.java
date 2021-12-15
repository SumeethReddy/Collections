package com.company.Java.lambda;

interface MyfunInterface3{
    public int doSomeCalculation(int a);
}

/*
class ImplMyfunInterface3 implements MyfunInterface3{

    @Override
    public int doSomeCalculation(int a) {
        int x = a + 10;
        x = x/2;
        return x;
    }
}
*/



public class LambdaExample3 {

    public static void main(String[] args) {

    MyfunInterface3 mf3 = (a) -> {
        int x = a + 10;
        x = x/2;
        return x;
    };
    int op = mf3.doSomeCalculation(25);
        System.out.println(op);
    }
}
