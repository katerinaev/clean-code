package hw_1.task_2.after1;

public class DiscountCalculator {
    public double calculateDiscount(double price, boolean isLoyalCustomer, boolean isFirstPurchase, boolean hasCoupon) {
        double discountRate = isLoyalCustomer
                ? (isFirstPurchase ? 0.1 : 0.05)
                : (hasCoupon ? 0.07 : 0.02);

        return price * (1 - discountRate);
    }
}
