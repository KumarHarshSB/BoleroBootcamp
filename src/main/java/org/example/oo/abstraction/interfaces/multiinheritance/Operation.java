package org.example.oo.abstraction.interfaces.multiinheritance;

public class Operation implements Add,Sub{
    @Override
    public int add(int a, int b){
        return a+b;
    }
    @Override
    public int sub(int a, int b){
        return a-b;
    }
}
