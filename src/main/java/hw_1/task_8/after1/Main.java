package hw_1.task_8.after1;

public class Main {
    public static void main(String[] args) {
        Sender emailSender = new EmailSender();
        Sender smsSender = new SMSSender();

        NotificationService emailNotification = new NotificationService(emailSender);
        emailNotification.sendNotification("Email has been sent");

        NotificationService smsNotification = new NotificationService(smsSender);
        smsNotification.sendNotification("SMS has been sent");
    }
}
