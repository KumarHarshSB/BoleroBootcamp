package org.example.solidprinciples.dependencyinversion;

public class GitVCS implements Git{
    @Override
    public void commit(String message) {
        System.out.println(message);
    }
    @Override
    public void push() {
        System.out.println("Pushed!");
    }
    @Override
    public void pull() {
        System.out.println("Pulled!");
    }
}
