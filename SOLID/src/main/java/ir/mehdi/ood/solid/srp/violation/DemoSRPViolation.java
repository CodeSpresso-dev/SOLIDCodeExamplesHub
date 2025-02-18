package ir.mehdi.ood.solid.srp.violation;

/**
 * Demo to execute SRP following payment sample
 */

public class DemoSRPViolation {

    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        paymentService.makePayment("u1", 1000.0);
    }
}
