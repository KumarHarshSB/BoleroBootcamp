package org.example.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test2 {
    public static void main(String args[]){
        List<String> names = Arrays.asList("Hari","Madhav","Acyuta","Yadava","Kesava","Gopinath","Gopal","Govind");

        //print each name
        names.forEach(System.out::println);

        //name starting with 'G'
        System.out.println("Starting with G");
        List<String> firstG = names.stream()
                .filter(i->i.startsWith("G"))
                .collect(Collectors.toList());
        firstG.forEach(System.out::println);

        //concate
        String concat = names.stream()
                .reduce("",String::concat);
        System.out.println(concat);

        //count
        System.out.println(names.stream().count());

        //first
        System.out.println(names.stream().findFirst());

        System.out.println(names.stream().allMatch(i->i.startsWith("G")));

        System.out.println(names.stream().anyMatch(i->i.startsWith("G")));
    }
}
