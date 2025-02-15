package ir.mehdi.ood.solid.dip.violation;

// کلاس اصلی پرداخت
class PaymentProcessor {
    private final CreditCardPayment creditCardPayment;
    private final PayPalPayment payPalPayment;

    public PaymentProcessor() {
        creditCardPayment = new CreditCardPayment();
        payPalPayment = new PayPalPayment();
    }

    public void processPayment(String method, double amount) {
        if (method.equals("creditCard")) {
            creditCardPayment.pay(amount);
        } else if (method.equals("paypal")) {
            payPalPayment.pay(amount);
        } else {
            System.out.println("Invalid payment method.");
        }
    }
}

