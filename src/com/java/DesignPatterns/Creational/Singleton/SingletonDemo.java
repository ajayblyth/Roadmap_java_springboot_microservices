package com.java.DesignPatterns.Creational.Singleton;

public class SingletonDemo {

    // Singleton class using static inner class approach
    static class Singleton {

        // Private constructor prevents instantiation from outside
        private Singleton() {
            System.out.println("Singleton Instance Created");
        }

        /*
         * Static inner class - loaded only when referenced.
         * Ensures lazy initialization and thread safety.
         */
        private static class SingletonHolder {
            private static final Singleton INSTANCE = new Singleton();
        }

        // Global access point to get the singleton instance
        public static Singleton getInstance() {
            return SingletonHolder.INSTANCE;
        }

        // Example method
        public void showMessage() {
            System.out.println("Hello from Singleton!");
        }
    }

    // Main method to test the Singleton behavior
    public static void main(String[] args) {
        // Calling getInstance multiple times returns the same object
        Singleton obj1 = Singleton.getInstance();
        obj1.showMessage();

        Singleton obj2 = Singleton.getInstance();
        System.out.println("Are both instances same? " + (obj1 == obj2)); // true
    }
}
