package com.java.DesignPatterns.Creational.Factory;


// Step 1: Define a common interface for all types of notifications

interface Notification {
    void notifyUser();  // Abstract method to be implemented by all notification types
}

// Step 2: Concrete implementation for Email notification
class EmailNotification implements Notification {
    public void notifyUser() {
        System.out.println("Sending Email Notification");
    }
}

// Step 3: Concrete implementation for SMS notification
class SMSNotification implements Notification {
    public void notifyUser() {
        System.out.println("Sending SMS Notification");
    }
}

// Step 4: Concrete implementation for Push notification
class PushNotification implements Notification {
    public void notifyUser() {
        System.out.println("Sending Push Notification");
    }
}

// Step 5: Factory class to encapsulate the object creation logic

class NotificationFactory {

    public static Notification createNotification(String type) {
        if (type == null) return null;

        if (type.equalsIgnoreCase("EMAIL")) return new EmailNotification();
        if (type.equalsIgnoreCase("SMS")) return new SMSNotification();
        if (type.equalsIgnoreCase("PUSH")) return new PushNotification();

        return null;  // Default case: unknown type
    }
}

// Step 6: Client-side code

public class FactoryDemo {
    public static void main(String[] args) {

        // The client only knows the type, not which class to instantiate
        // The factory takes care of object creation

        Notification notification = NotificationFactory.createNotification("EMAIL");

        // Call the interface method — actual implementation is hidden

        notification.notifyUser();  // Output: Sending Email Notification
    }
}