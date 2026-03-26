class Notifier {

    // Public method
    public void send(String message) {
        System.out.println("Public: General Notification -> " + message);
    }

    // Protected method
    protected void send(String message, String email) {
        System.out.println("Protected: Email sent to " + email + " -> " + message);
    }

    // Default (no modifier)
    void send(String message, long phoneNumber) {
        System.out.println("Default: SMS sent to " + phoneNumber + " -> " + message);
    }

    // Private method (not accessible outside this class)
    private void send(String message, String email, long phoneNumber) {
        System.out.println("Private: Internal Multi-channel Notification -> "
                + message + " | " + email + " | " + phoneNumber);
    }

    // Public method to access private method
    public void triggerInternal(String message, String email, long phoneNumber) {
        send(message, email, phoneNumber); // calling private method
    }
}


class AppNotifier extends Notifier {

    public void testMethods() {

        // Calling inherited methods (overloading demo)
        send("Hello User"); // public
        send("Hello via Email", "user@example.com"); // protected
        send("Hello via SMS", 9876543210L); // default

        //  Cannot call private method directly
        // send("Hi", "mail", 123); // ERROR

        // Accessing private method indirectly
        triggerInternal("Secret Alert", "admin@example.com", 9999999999L);
    }
}


public class Mainnotifi {
    public static void main(String[] args) {

        System.out.println("---- Using AppNotifier ----");
        AppNotifier app = new AppNotifier();
        app.testMethods();

        System.out.println("\n---- Compile-time Polymorphism Demo ----");

        Notifier notifier = new Notifier();

        // Method overloading (decided at compile time)
        notifier.send("General Message");
        notifier.send("Email Message", "abc@mail.com");
        notifier.send("SMS Message", 9123456780L);

        // Accessing private method via public method
        notifier.triggerInternal("Internal Msg", "hidden@mail.com", 8888888888L);
    }
}