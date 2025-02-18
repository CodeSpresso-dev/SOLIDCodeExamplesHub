package ir.mehdi.ood.solid.srp.violation;

public class PaymentService {
    public void makePayment(String userId, double amount) {
        // 1. Validate payment
        if (amount <= 0) {
            throw new IllegalArgumentException("Invalid amount");
        }

        // 2. Process payment
        System.out.println("Processing payment of $" + amount + " for user " + userId);

        // 3. Send notification
        System.out.println("Sending payment confirmation email to user " + userId);
    }
}
