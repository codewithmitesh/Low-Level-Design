package SolidCheezy.ISP.ProblematicCode;

public class BankTransfer implements IPaymentProcessor {
    @Override
    public void processPayment(double amount) {
        // Code to process bank transfer payment
        System.out.println("Processing bank transfer payment of: " + amount);
    }

    @Override
    public void refundPayment(double amount) {
        // Code to refund bank transfer payment
        System.out.println("Refunding bank transfer payment of: " + amount);
    }

    @Override
    public void applyDiscount(double amount) {
        // Bank transfers do not support discounts, but we are forced to implement this
        // method
        // this is wrong. this does not follow the Interface Segregation Principle
        throw new UnsupportedOperationException("Bank transfers do not support discounts");
    }
}
