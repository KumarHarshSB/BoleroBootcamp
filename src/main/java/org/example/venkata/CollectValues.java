package org.example.venkata;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors.*;

import static java.util.stream.Collectors.toList;

public class CollectValues {
    public static void main(String args[]){
        List<Integer> list = Arrays.asList(12, 13, 14, 16, 19, 20);
        List<Integer> doubleEven =
            list.stream()
                .filter(i->i%2==0)
                .map(i->i*2)
                .collect(toList());
        System.out.println(doubleEven);

        List<String> words=Arrays.asList("Hari","Ram","Krishna");
        words.forEach(System.out::println);
    }
}
