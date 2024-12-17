package JavaCodesForExam;
import java.util.Scanner;

public class primenumber {
    public static boolean primeCheck(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num you want to check prime or not: ");
        int num = sc.nextInt();
        boolean ans = primeCheck(num);
        if (ans) {
            System.out.println("The number " + num + " is a prime number.");
        } else {
            System.out.println("The number " + num + " is not a prime number");
        }
        sc.close();
    }

}
