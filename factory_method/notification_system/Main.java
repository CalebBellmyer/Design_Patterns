public class Main {
    public static void main(String[] args) {
        NotificationFactory emailFactory = new EmailNotificationFactory();
        NotificationFactory smsFactory = new SMSNotificationFactory();
        NotificationFactory pushFactory = new PushNotificationFactory();

        Notification email = emailFactory.createNotification();
        email.send("Hello");

        Notification sms = smsFactory.createNotification();
        sms.send("Hello");

        Notification push = pushFactory.createNotification();
        push.send("Hello");
    }

}


