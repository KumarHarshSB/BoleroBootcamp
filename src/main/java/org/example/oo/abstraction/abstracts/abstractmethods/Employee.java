package org.example.oo.abstraction.abstracts.abstractmethods;

class Employee extends Google {
    Employee(){
        System.out.println("Employee Constructor Called");
    }
    String name="Ram";
    int age=16;
    @Override void printInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    static void methodHiding(){
        System.out.println("methodHiding of Child Class");
    }
}
