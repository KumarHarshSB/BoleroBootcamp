package org.example.java8.functionalinterface.after;

public class Test {
    public static void main(String[] args) {
        new Thread(()->System.out.println("Hare Krishna Java 8")).start();
    }
}
