package SolidCheezy.OCP.BetterCode;

// only single service here this class will change if we add new notification types hence it violates 
// the open/closed principle
// here see it is not closed for modification and we cant extend it easily
public class NotificationService {

    public void sendNotification(INotification notification, String message) {
        notification.sendNotification(message);
    }
}