import java.util.ArrayList;
import java.util.List;

// Define a class for a notification
class Notification {
    private String message;

    public Notification(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

// Define a class for the e-commerce app
class ECommerceApp {
    private List<String> subscribedUsers;

    public ECommerceApp() {
        subscribedUsers = new ArrayList<>();
    }

    // Method to subscribe a user to notifications
    public void subscribeUser(String userId) {
        subscribedUsers.add(userId);
    }

    // Method to send a notification to all subscribed users
    public void sendNotification(String message) {
        for (String userId : subscribedUsers) {
            // Code to send notification to each user
            System.out.println("Notification sent to user " + userId + ": " + message);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an instance of the e-commerce app
        ECommerceApp app = new ECommerceApp();

        // Subscribe users to notifications
        app.subscribeUser("user1");
        app.subscribeUser("user2");
        app.subscribeUser("user3");

        // Create a notification
        Notification notification = new Notification("New books and toys added! Check them out.");

        // Send the notification to all subscribed users
        app.sendNotification(notification.getMessage());
    }
}

