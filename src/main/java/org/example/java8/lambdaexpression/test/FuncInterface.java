package org.example.java8.lambdaexpression.test;

public interface FuncInterface {
    void func(int x);
    default void func2() {
        System.out.println("Rama");
    }
}
