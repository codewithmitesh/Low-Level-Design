package SolidCheezy.ISP.ProblematicCode;

public class CreditCard implements IPaymentProcessor {
    @Override
    public void processPayment(double amount) {
        // Code to process credit card payment
        System.out.println("Processing credit card payment of $" + amount);
    }

    @Override
    public void refundPayment(double amount) {
        // Code to refund credit card payment
        System.out.println("Refunding credit card payment of $" + amount);
    }

    // Credit cards do not support refunds, this method is irrelevant
    // this should not be here
    @Override
    public void applyDiscount(double amount) {
        // Credit cards do not support discounts, this method is irrelevant
        throw new UnsupportedOperationException("Credit cards do not support discounts");
    }

}
