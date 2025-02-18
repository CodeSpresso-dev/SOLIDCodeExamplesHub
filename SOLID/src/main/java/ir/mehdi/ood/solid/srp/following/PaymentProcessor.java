package ir.mehdi.ood.solid.srp.following;

/**
 * Responsible for processing payments
 */

public class PaymentProcessor {
    public void process(String userId, double amount) {
        System.out.println("Processing payment of $" + amount + " for user " + userId);
    }
}
