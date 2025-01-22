package org.example.oo.abstraction.interfaces.multiinheritance;

public class Driver {
    public static void main(String[] args) {
        Operation op = new Operation() {};
        System.out.println(op.add(10,20));
        System.out.println(op.sub(10,20));
    }
}
