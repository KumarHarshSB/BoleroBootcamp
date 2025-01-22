package org.example.venkata;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pipeline {
    public static void main(String args[]){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(8);
        numbers.add(12);
        numbers.add(13);

        List<Integer> num = Arrays.asList(1,2,3,4,5,6,7,8);

        //sum of even numbers
        System.out.println(
                numbers.stream()
                        .filter(i->i%2==0)
                        .map(i->i*2)
                        .reduce(0,Integer::sum)
        );
    }
}
