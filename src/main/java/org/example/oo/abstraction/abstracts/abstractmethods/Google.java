package org.example.oo.abstraction.abstracts.abstractmethods;

abstract class Google{
    Google(){
        System.out.println("Google Constructor Called");
    }
    abstract void printInfo();
    void printMantra(){
        System.out.println("Mantra");
    }
    static void methodHiding(){
        System.out.println("methodHiding of Base Class");
    }
}
