package hw_1.task_4.after1;

public class Order {
    protected int number;

    public Order(int number) {
        this.number = number;
    }

    public int getNumber() {
        return this.number;
    }

    public void orderInfo() {
        System.out.println("Order #: " + getNumber());
    }
}

