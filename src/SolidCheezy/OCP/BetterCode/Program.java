package SolidCheezy.OCP.BetterCode;

public class Program {
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();
        notificationService.sendNotification(new EmailNotification(), "Hello via Email!");
        notificationService.sendNotification(new SMSNotification(), "Hello via SMS!");
        notificationService.sendNotification(new WhatsappNotification(), "Hello via WhatsApp!");
    }
}
