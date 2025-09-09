package SolidCheezy.ISP.BetterCode;

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
}
