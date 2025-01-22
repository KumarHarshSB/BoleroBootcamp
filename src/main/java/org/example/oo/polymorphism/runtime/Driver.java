package org.example.oo.polymorphism.runtime;

public class Driver {
    public static void main(String[] args) {
        Parent a;

        a = new Child1();
        a.Print();

        a = new Child2();
        a.Print();
    }
}
