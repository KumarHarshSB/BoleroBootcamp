package org.example.venkata;

import java.awt.*;
import java.util.ArrayList;

public class MethodReference {
    public static void main(String args[]){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(11);
        numbers.add(23);
        numbers.add(16);

        //external iterator
        for(int e: numbers) {
            System.out.println(e);
        }

        // internal iterator
        // using lambda
        numbers.forEach((i)->System.out.println(i));

        // method reference
        // parameter as an argument
        numbers.forEach(System.out::println);

        System.out.println("String Stream");

        // parameter as an argument for static variable
        numbers.stream()
                .map(String::valueOf)
                .forEach(System.out::println);

        // summing
        System.out.println(numbers.stream()
                .reduce(0,Integer::sum));

        // concatenate
        System.out.println(numbers.stream()
                .map(String::valueOf)
                .reduce("",String::concat));
    }
}
