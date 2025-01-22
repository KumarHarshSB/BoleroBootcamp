package org.example.venkata;

import java.util.Arrays;
import java.util.List;

public class Map {
    public static void main(String args[]){
        List<Integer> num = Arrays.asList(21,14,18,15,9);

        System.out.println(num
                .stream()
                .filter(i->i>3)
                .filter(i->i%2==0)
                .map(i->i*2)
                .findFirst()
        );
    }
}
