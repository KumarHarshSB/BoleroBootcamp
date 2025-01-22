package org.example.solidprinciples.dependencyinversion;

public class GitForDev{
    Git ob;
    GitForDev(Git ob){
        this.ob=ob;
    }
    void makeCommit(String message) {
        ob.commit(message);
    }
    void makePush() {
        ob.push();
    }
    void makePull() {
        ob.pull();
    }
}
