package org.example.dependencyinjection.loosecoupled;

public class SMSProvider implements NotificationProvider{
    @Override
    public void sendNotification(String message, String recipient){
        System.out.println("Sending SMS to " + recipient + ": " + message);
    }
}
