package org.example.java8.optionalclass;

import java.util.Optional;

public class Demo {
    public static void main(String[] args) {
        String[] names = new String[10];
        Optional<String> nullCheck = Optional.ofNullable(names[5]);

        if(nullCheck.isPresent()){
            String word = names[5].toLowerCase();
            System.out.println(word);
        }
        else{
            System.out.println("word is null");
        }
    }
}
