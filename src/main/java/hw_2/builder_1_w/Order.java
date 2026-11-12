package hw_2.builder_1_w;

import java.util.ArrayList;
import java.util.List;

/*
Implement a builder pattern for creating orders in an online store:
Order class: This class represents the final object that will store all order details,
such as items, discounts, and the payment method.
OrderBuilder class: This class is responsible for constructing an Order object.
It provides methods for adding items, applying discounts, and selecting a payment method.
Each method returns the builder instance itself to support method chaining (a fluent interface).
Shop class: This class represents the store and uses the builder to create orders. It utilizes the OrderBuilder to construct orders without needing to know the specific implementation details.
 */
public class Order {
    private List<String> products = new ArrayList<>();
    private double discount;
    private String paymentMethod;

    public Order(double discount, String paymentMethod) {
        this.discount = discount;
        this.paymentMethod = paymentMethod;
    }

    public Order(OrderBuilder builder) {
        this.products = builder.products;
        this.discount = builder.discount;
        this.paymentMethod = builder.paymentMethod;
    }

    @Override
    public String toString() {
        return "Order:\n" +
        "Products: " + products + "\n" +
        "discount: " + discount * 100 + "%\n" +
        "payment method: " + paymentMethod;
    }

    static class OrderBuilder {
        private List<String> products = new ArrayList<>();
        private double discount;
        private String paymentMethod;

        public OrderBuilder addProduct(String product) {
            products.add(product);
            return this;
        }

        public OrderBuilder setDiscount(double discount) {
            this.discount = discount;
            return this;
        }

        public OrderBuilder setPaymentMethod(String paymentMethod) {
            this.paymentMethod = paymentMethod;
            return this;
        }

        public Order build() {
            return new Order(this);
        }
    }
}
