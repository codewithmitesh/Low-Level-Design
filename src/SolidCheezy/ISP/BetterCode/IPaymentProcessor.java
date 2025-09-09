package SolidCheezy.ISP.BetterCode;

// To fix the ISP
public interface IPaymentProcessor {
    void processPayment(double amount);

    void refundPayment(double amount);
}