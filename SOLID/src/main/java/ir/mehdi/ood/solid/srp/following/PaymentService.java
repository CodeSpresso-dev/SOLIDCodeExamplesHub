package ir.mehdi.ood.solid.srp.following;

/**
 * Responsible for processing payments
 */

public class PaymentService {

    private final PaymentValidator validator;
    private final PaymentProcessor processor;
    private final NotificationService notifier;

    public PaymentService(PaymentValidator validator, PaymentProcessor processor, NotificationService notifier) {
        this.validator = validator;
        this.processor = processor;
        this.notifier = notifier;
    }

    public void makePayment(String userId, double amount) {
        validator.validate(amount);
        processor.process(userId, amount);
        notifier.sendPaymentNotification(userId);
    }
}
