package org.example.dependencyinjection.tightcoupled;

public class NotificationService {
    // tightly coupled with EmailProvider
    // in case we wish to replace it with SMSProvider we need to change the code
    private EmailProvider emailProvider = new EmailProvider();
    public void sendNotification(String message, String recipient) {
        emailProvider.sendEmail(message, recipient);
    }
}
