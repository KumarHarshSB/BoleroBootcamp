package org.example.java8.lambdaexpression.test;

public class Test {
    public static void main(String[] args) {
        FuncInterface funcInterface = (x)->System.out.println(2*x);
        funcInterface.func(5);
    }
}
