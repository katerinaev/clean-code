package hw_1.task_8.before;

/**
 * Нарушение DIP (Dependency Inversion Principle) – жесткая зависимость от конкретных классов
 * Задача: Используйте интерфейсы и внедрение зависимостей, чтобы ослабить связь между классами.
 */
public class NotificationService {
    private EmailSender emailSender = new EmailSender();
    public void sendNotification(String message) {
        emailSender.sendEmail(message);
    }
}
