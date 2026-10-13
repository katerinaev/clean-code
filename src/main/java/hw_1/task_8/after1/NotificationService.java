package hw_1.task_8.after1;

public class NotificationService {
    private Sender sender;

    public NotificationService(Sender sender) {
        this.sender = sender;
    }

    public void sendNotification(String message) {
        sender.send(message);
    }
}
