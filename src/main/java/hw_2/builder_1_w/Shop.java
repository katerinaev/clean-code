package hw_2.builder_1_w;

public class Shop {
    public static void main(String[] args) {
        Order order = new Order.OrderBuilder()
                .addProduct("Laptop Lenovo")
                .addProduct("Headphones Apple")
                .setDiscount(0.15)
                .setPaymentMethod("Card")
                .build();

        System.out.println(order);
    }
}
