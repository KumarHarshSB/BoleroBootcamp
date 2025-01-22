package org.example.venkata;

public class FirstLambda {
    public static void main(String args[]){
        Thread th = new Thread(() -> System.out.println("In run"));
        th.start();
        System.out.println("In main");
    }
}
