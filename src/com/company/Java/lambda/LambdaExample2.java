package com.company.Java.lambda;

interface MyFunInterface2{
    public int findLength(String s);
}

/*class ImpleMyfunInterface2 implements MyFunInterface2 {

    @Override
    public int findLength(String s) {
        return s.length();
    }
}*/

public class LambdaExample2 {

    public static void main(String[] args) {
       MyFunInterface2 mf = s -> s.length();
       int len = mf.findLength("SUmeeth");
        System.out.println("Length of the string is: "+len);

    }
}
