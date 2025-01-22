package org.example.solidprinciples.dependencyinversion;

public class Driver {
    public static void main(String[] args) {
        GitVCS vcs = new GitVCS();
        vcs.commit("Hare Krishna");
        vcs.push();

        // here a developer is directly implementing with Git reference without needing GitVCS implementation
        GitVCS git= new GitVCS();
        GitForDev dev = new GitForDev(git);
        dev.makeCommit("Hare Rama");
        dev.makePush();
    }
}
