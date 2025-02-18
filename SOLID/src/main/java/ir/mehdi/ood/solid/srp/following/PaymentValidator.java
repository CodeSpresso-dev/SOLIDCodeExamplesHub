package ir.mehdi.ood.solid.srp.following;

/**
 * Responsible for validating payment amounts
 */

public class PaymentValidator {
    public void validate(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be greater than zero");
        }
    }
}
