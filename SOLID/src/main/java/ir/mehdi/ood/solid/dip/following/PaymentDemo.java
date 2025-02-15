package ir.mehdi.ood.solid.dip.following;

// کلاینت
public class PaymentDemo {
    public static void main(String[] args) {
        PaymentMethod creditCard = new CreditCardPayment();
        PaymentMethod paypal = new PayPalPayment();

        PaymentProcessor paymentProcessor1 = new PaymentProcessor(creditCard);
        paymentProcessor1.processPayment(100.0);

        PaymentProcessor paymentProcessor2 = new PaymentProcessor(paypal);
        paymentProcessor2.processPayment(150.0);
    }
}
