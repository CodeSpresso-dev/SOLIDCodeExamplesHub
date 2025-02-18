package ir.mehdi.ood.solid.srp.following;

/**
 * Responsible for sending payment notifications
 */

public class NotificationService {
    public void sendPaymentNotification(String userId) {
        System.out.println("Sending payment confirmation email to user " + userId);
    }
}
