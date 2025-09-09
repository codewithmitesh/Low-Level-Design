package SolidCheezy.OCP.ProblematicCode;

// only single service here this class will change if we add new notification types hence it violates 
// the open/closed principle
// here see it is not closed for modification and we cant extend it easily
public class NotificationService {

    public void sendNotification(String type, String message) {
        if (type.equals("EMAIL")) {
            // Code to send email
            System.out.println("Sending Email: " + message);
        } else if (type.equals("SMS")) {
            // Code to send SMS
            System.out.println("Sending SMS: " + message);
        } else if (type.equals("PUSH")) {
            // Code to send Push Notification
            System.out.println("Sending Push Notification: " + message);
        } else {
            throw new IllegalArgumentException("Unsupported notification type");
        }
    }
}