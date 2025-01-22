package org.example.dependencyinjection.loosecoupled;

public class Driver {
    public static void main(String[] args) {
        EmailProvider emailProvider = new EmailProvider();
        NotificationService notificationService = new NotificationService(emailProvider);
        notificationService.sendNotification("Hare Krishna!", "Gopinath");

        SMSProvider smsProvider = new SMSProvider();
        NotificationService notificationService2 = new NotificationService(smsProvider);
        notificationService2.sendNotification("Hare Krishna!", "Gopinath");
    }
}
