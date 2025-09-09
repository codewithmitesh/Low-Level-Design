package SolidCheezy.ISP.ProblematicCode;

// here we have an interface that defines the payment processing methods 
// not all payment processors support all methods
// hence we are forced to implement methods that may not be relevant
// this is violation of Interface Segregation Principle
public interface IPaymentProcessor {
    void processPayment(double amount);

    void refundPayment(double amount);

    void applyDiscount(double amount);
}
