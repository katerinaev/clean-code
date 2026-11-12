package hw_1.task_5.after1;

public class Main {
    public static void main(String[] args) {
        Payment payPal = new PayPal();
        Payment bitcoin = new Bitcoin();
        Payment creditCard = new CreditCard();

        creditCard.pay(505.55);
        payPal.pay(222.77);
        bitcoin.pay(44.44);
    }
}
