package org.example.dependencyinjection.tightcoupled;

public class EmailProvider {
    void sendEmail(String message, String recipient) {
        System.out.println("Sending email to " + recipient + ": " + message);
    }
}
