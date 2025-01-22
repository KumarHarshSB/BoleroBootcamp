package org.example.dependencyinjection.loosecoupled;

public class EmailProvider implements NotificationProvider{
    @Override
    public void sendNotification(String message, String recipient) {
        System.out.println("Sending email to " + recipient + ": " + message);
    }
}
