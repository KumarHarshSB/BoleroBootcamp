package org.example;

class Student {
    int id;
    String name;

    void printStudent() {
        System.out.println(id + " " + name);
    }
}
public class Numbers {
    int a;
    int b;
    static int c;
    static int d;
    int sum() {
        return a+b;
    }
    static void message(){
        System.out.println("Hare Krishna");
    }
    int sub() {
        return a-b;
    }
    public static void main(String[] args) {
        Numbers numbers = new Numbers();
        numbers.a = 10;
        numbers.b = 20;
        int sumUp = numbers.sum();
        System.out.println(sumUp);

        //static properties accessed without class instances
        Numbers.message();
        Numbers.c=100;
        Numbers.d=200;

        //calling a Method
        Student s= new Student();
        s.id=16;
        s.name="Krishna";
        s.printStudent();
    }
}
