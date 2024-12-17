package JavaCodesForExam;
import java.util.Scanner;

public class SumOfIntegersInteractive {
    public static void main(String[] args) {
        // Read the number of integers to be entered from the command line argument
        int count = Integer.parseInt(args[0]);

        int sum = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter " + count + " integers:");
        for (int i = 0; i < count; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            int number = scanner.nextInt();
            sum += number;
        }

        System.out.println("The sum of the entered integers is: " + sum);
        scanner.close();
    }
}

// PS E:\Coding Languages\Java Progamming> javac .\SumOfIntegersInteractive.java
// PS E:\Coding Languages\Java Progamming> java SumOfIntegersInteractive 5
// Enter 5 integers:
// Enter integer 1: 1
// Enter integer 2: 4
// Enter integer 3: 5
// Enter integer 4: 2
// Enter integer 5: 0
// The sum of the entered integers is: 12