package ir.mehdi.ood.solid.srp.following;

/**
 * Demo to execute SRP following payment sample
 */

public class DemoSRPFollowing {

    public static void main(String[] args) {

        PaymentValidator validator = new PaymentValidator();
        PaymentProcessor processor = new PaymentProcessor();
        NotificationService notifier = new NotificationService();

        PaymentService paymentService = new PaymentService(validator, processor, notifier);
        paymentService.makePayment("u1", 1000.0);
    }
}
