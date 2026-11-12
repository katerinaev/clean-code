package hw_1.task_5.after1;

public class Bitcoin implements Payment {
    public void pay(double amount) {
        System.out.println("Payment in Bitcoin in the amount of: " + amount);
    }
}
