package ir.mehdi.ood.solid.dip.following;

// کلاس پی‌پال
class PayPalPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using PayPal.");
    }
}
