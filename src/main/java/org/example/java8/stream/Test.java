package org.example.java8.stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Set;

public class Test {
    public static void main(String args[]){
        List<List<String>> greetings = Arrays.asList(
                Arrays.asList("Hare","Krishna"),
                Arrays.asList("Ram","Raghav"),
                Arrays.asList("Jai","Sri","Ram")
        );

        Set<String> intermediate = new HashSet<>();

        List<String> result = greetings.stream()
                .flatMap(List::stream)
                .filter(s->s.startsWith("R"))
                .map(String::toUpperCase)
                .distinct()
                .sorted()
                .peek(s->intermediate.add(s))
                .collect(Collectors.toList());

        System.out.println("Intermediate Result");
        intermediate.forEach(System.out::println);

        System.out.println("Final Result");
        result.forEach(System.out::println);
    }
}
