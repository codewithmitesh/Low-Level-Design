package SolidCheezy.OCP.BetterCode;

public class EmailNotification implements INotification {

    @Override
    public void sendNotification(String message) {
        // Code to send email
        System.out.println("Sending Email: " + message);
    }
}
