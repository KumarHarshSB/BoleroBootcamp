package org.example.dependencyinjection.loosecoupled;

public class NotificationService {
    NotificationProvider notificationProvider;

    // injecting dependency
    public NotificationService(NotificationProvider notificationProvider) {
        this.notificationProvider = notificationProvider;
    }
    public void sendNotification(String message, String recipient) {
        notificationProvider.sendNotification(message, recipient);
    }
}
