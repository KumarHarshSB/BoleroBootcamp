package org.example.dependencyinjection.tightcoupled;

public class Driver {
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();
        notificationService.sendNotification("Hare Krishna!", "Rajeev");
    }
}
