package org.example.oo.abstraction.abstracts.noabstractmethods;

public class Driver {
    public static void main(String[] args) {
        Test test = new TestChild();
        test.display();
    }
}
