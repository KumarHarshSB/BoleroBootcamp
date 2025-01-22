package org.example.java8.functionalinterface.before;

public class Test {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hare Krishna Java 5");
            }
        }).start();
    }
}
