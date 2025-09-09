package SolidCheezy.OCP.BetterCode;

public class SMSNotification implements INotification {

    @Override
    public void sendNotification(String message) {
        // Code to send SMS
        System.out.println("Sending SMS: " + message);
    }
}
