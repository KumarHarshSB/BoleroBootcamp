package org.example.oo.abstraction.abstracts.abstractmethods;

public class Driver {
    public static void main(String[] args) {
        //reference to abstract class
        Google emp = new Employee();
        emp.printInfo();
        emp.methodHiding();

        //control flow for constructors in abstract class
        Employee emp2 = new Employee();
    }
}
