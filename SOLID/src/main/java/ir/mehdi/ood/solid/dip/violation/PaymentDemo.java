package ir.mehdi.ood.solid.dip.violation;

// کلاینت
public class PaymentDemo {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        paymentProcessor.processPayment("creditCard", 100.0);
        paymentProcessor.processPayment("paypal", 150.0);
    }
}
