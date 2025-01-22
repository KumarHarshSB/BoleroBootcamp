package org.example.oo.abstraction.interfaces.simple;

public class Driver {
    public static void main(String[] args) {
        Implementor obj = new Implementor();
        obj.display();
        System.out.println(TestInterface.a);
    }
}
