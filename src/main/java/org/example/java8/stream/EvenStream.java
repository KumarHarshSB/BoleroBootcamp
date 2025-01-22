package org.example.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EvenStream {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(5);
        list.add(12);
        list.add(25);

        List<Integer> even = list.stream().filter(i->i%2==0).collect(Collectors.toList());
        even.forEach(System.out::println);

        int highest = list.stream().max(Integer::compare).get();

        List<String> names = new ArrayList<String>();
        names.add("hari");
        names.add("ram");
        names.add("krishna");
        names.add("madhusudana");
//        System.out.println(longest);
    }
}
