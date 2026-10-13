package hw_1.task_4.after1;

public class Main {
    public static void main(String[] args) {
        Order order = new Order(111);

        OrderProcessor orderProcessor = new OrderProcessor();
        EmailService emailService = new EmailService();
        InvoiceService invoiceService = new InvoiceService();

        order.orderInfo();
        orderProcessor.processOrder();
        emailService.sendEmail();
        invoiceService.generateInvoice();
    }
}
