package ir.mehdi.ood.solid.dip.following;

// کلاس کارت اعتباری
class CreditCardPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }
}
