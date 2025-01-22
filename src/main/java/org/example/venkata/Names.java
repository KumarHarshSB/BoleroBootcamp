package org.example.venkata;

import java.util.List;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Collectors.*;

public class Names {
    public static void main(String args[]){
        List<String> names = Arrays.asList("Ram","Krishna","Narsimha","Varaha","Kurma","Vamana","Kalki","Buddha","Rishabhdeva","Prithu","Matsya");
        System.out.println(names.get(0));

        //names starting with K
        System.out.println("God's with first letter K:");
        List<String> firstK = names
                .stream()
                .filter(i->i.startsWith("K"))
                .collect(Collectors.toList());
        firstK.forEach(System.out::println);

        //concatenate name
        String concat = names
                .stream()
                .reduce("",String::concat);
        System.out.println(concat);

        //count
        long count = names.stream().count();
        System.out.println(count);

        //find first
        Optional<String> first = names.stream().findFirst();
        first.ifPresent(System.out::println);

        //any names starting with S
        boolean firstS = names.stream()
                .anyMatch(i->i.startsWith("S"));
        System.out.println(firstS);
    }
}
