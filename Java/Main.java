import pkg.Singleton;

public class Main {
    public static void main(String[] args) {
        // Access the singleton instance
        Singleton singleton1 = Singleton.getInstance();
        singleton1.showMessage();

        // Verify that only one instance is created
        Singleton singleton2 = Singleton.getInstance();
        singleton2.showMessage();

        // Check if both references point to the same instance
        System.out.println(singleton1 == singleton2); // Output: true
    }
}
