package com.company.Java.lambda;

public class LambdaPractice {

  public void myName() {
      System.out.println("Sumeeth");
      // () -> System.out.println("Sumeeth");
  }

  public void add(int a, int b){
      System.out.println(a+b);

      // (a,b) -> sout(a+b);
  }

  public int length(String s){
        return s.length();
  }

  // (s) -> s.length();
}


