package pkg;

public class Singleton {
    // Step 1: Create a private static instance variable (not initialized yet)
    private static Singleton instance;

    // Step 2: Make the constructor private to prevent external instantiation
    private Singleton() {
        // Private constructor
    }

    // Step 3: Provide a public static method to access the instance
    public static Singleton getInstance() {
        // Step 4: Create the instance only if it doesn't exist
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Example method to demonstrate functionality
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}