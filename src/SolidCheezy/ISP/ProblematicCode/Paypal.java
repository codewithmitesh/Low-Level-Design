package SolidCheezy.ISP.ProblematicCode;

public class Paypal implements IPaymentProcessor {

    @Override
    public void processPayment(double amount) {
        // Code to process payment via PayPal
        System.out.println("Processing PayPal payment of $" + amount);
    }

    // Paypal implements all
    @Override
    public void refundPayment(double amount) {
        // Code to refund payment via PayPal
        System.out.println("Refunding PayPal payment of $" + amount);
    }

    @Override
    public void applyDiscount(double amount) {
        // Code to apply discount via PayPal
        System.out.println("Applying discount of $" + amount + " via PayPal");
    }

}
