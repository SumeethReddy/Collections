package com.company.Java.lambda;

public class LambdaExample {

    public static void main(String[] args) {
       FunInterfaceExample f = () -> System.out.println("Functional without any argument and return type! Implememted using lambda");
       f.funMethod();
    }
}


interface FunInterfaceExample{
    public void funMethod();
}

/*class ImpleFunInterfaceExample implements FunInterfaceExample{

    @Override
    public void funMethod() {
        System.out.println("Functional without any argument and return type!");
    }
}*/
