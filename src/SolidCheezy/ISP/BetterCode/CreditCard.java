package SolidCheezy.ISP.BetterCode;

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
    // HERE we dont have to implement the IDiscountPaymentProcessor interface as it
    // is not supported in creditcard

}
