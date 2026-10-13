package hw_1.task_5.after1;

public class CreditCard implements Payment {
    public void pay(double amount) {
        System.out.println("Payment by credit card in the amount of: " + amount);
    }
}
