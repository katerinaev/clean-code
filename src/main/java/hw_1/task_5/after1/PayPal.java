package hw_1.task_5.after1;

public class PayPal implements Payment {

    public void pay(double amount) {
        System.out.println("Payment via PayPal for the amount: " + amount) ;
    }
}
