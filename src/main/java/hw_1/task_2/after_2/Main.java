package hw_1.task_2.after_2;

import hw_1.task_2.after1.DiscountCalculator;

public class Main {
    public static void main(String[] args) {
        hw_1.task_2.after1.DiscountCalculator discountCalculator = new DiscountCalculator();
        System.out.println(discountCalculator.calculateDiscount(100.00, false, true, true));
    }
}
