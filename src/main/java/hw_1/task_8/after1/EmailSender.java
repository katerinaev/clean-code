package hw_1.task_8.after1;

public class EmailSender implements Sender {
    public void send(String message) {
        System.out.println("Sending email: " + message);
    }
}
