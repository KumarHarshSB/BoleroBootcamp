package org.example.solidprinciples.dependencyinversion;

public interface Git {
    void commit(String message);
    void push();
    void pull();
}
