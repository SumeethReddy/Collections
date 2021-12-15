package com.company.Java.lambda;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
    String s = "Sumeeth";
    Function<String, Integer> fun = str -> str.length();
    int len = fun.apply(s);
/*    int len = callLength(s);*/
        System.out.println(len);
}

/*private static int callLength(String s){
        return s.length();
}*/
}
