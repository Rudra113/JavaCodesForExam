package JavaCodesForExam;
public class factorial {
    public static int fact(int num) {
        if (num == 0) {
            return 1;
        }
        int fmo = fact(num - 1);
        return num * fmo;
    }

    public static void main(String[] args) {

        System.out.println("The factorial of 7 is " + fact(7));
    }
}

// public static int fact(int num) {
// int result = 1;
// for (int i = 2; i <= num; i++) {
// result *= i;
// }
// return result;
// }
