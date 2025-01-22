package org.example.java8.methodreference.test;

import java.util.Arrays;

public class Test {
    public static void print(String s) {
        System.out.println(s);
    }
    public static void main(String[] args) {
        String[] names = {"adhoksaje", "baladeva", "chaitanya"};
        Arrays.stream(names).forEach(Test::print);
    }
}
