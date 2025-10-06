package solidPrinciples.liskovSubstitutionPrinciple;



public class LSP2 {
    public static void main(String[] args) {
        Notification email = new EmailNotification();
        email.sendNotification("sending notification by email");
        Notification whatsapp = new EmailNotification();
        whatsapp.sendNotification("wp sending notification");
    }
}

interface Notification {
    void sendNotification(String message);
}

class EmailNotification implements Notification {

    @Override
    public void sendNotification(String message) {
        System.out.println("Email notification");
    }
}


class WhatsAppNotification implements Notification {

    @Override
    public void sendNotification(String message) {
        System.out.println("Whatsapp notification");
    }
}
