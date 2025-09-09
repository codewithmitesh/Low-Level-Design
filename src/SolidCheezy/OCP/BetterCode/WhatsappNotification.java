package SolidCheezy.OCP.BetterCode;

public class WhatsappNotification implements INotification {

    @Override
    public void sendNotification(String message) {
        // Code to send WhatsApp notification
        System.out.println("Sending WhatsApp Notification: " + message);
    }
}
