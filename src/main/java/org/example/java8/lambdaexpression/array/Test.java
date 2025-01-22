package org.example.java8.lambdaexpression.array;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println("Elements in list:");
        list.forEach((x)->System.out.println(x));
        // forEach method of ArrayList takes a parameter of type Consumer<T>, which is a functional interface
    }
}
