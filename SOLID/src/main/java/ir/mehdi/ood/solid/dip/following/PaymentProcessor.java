package ir.mehdi.ood.solid.dip.following;

// کلاس اصلی پرداخت
class PaymentProcessor {
    private final PaymentMethod paymentMethod;

    // وابستگی از طریق سازنده تزریق می‌شود
    public PaymentProcessor(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void processPayment(double amount) {
        paymentMethod.pay(amount);
    }
}
