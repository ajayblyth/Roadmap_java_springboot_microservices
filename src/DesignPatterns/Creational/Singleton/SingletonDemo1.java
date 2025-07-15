package DesignPatterns.Creational.Singleton;

public class SingletonDemo1 {

    private SingletonDemo1(){
        System.out.println("created");

    }
    private static  class SigletonHolder{
        private static final SingletonDemo1 INSTANCE  = new SingletonDemo1();

    }

    public static SingletonDemo1 getInstance(){
        return SigletonHolder.INSTANCE;
    }
    // Main method to test the Singleton behavior
    public static void main(String[] args) {
        // Calling getInstance multiple times returns the same object
     SingletonDemo1.getInstance();


    }
}
