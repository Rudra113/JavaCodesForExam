package JavaCodesForExam;
public class decimaltobinary {
    public static int dectobin(int num) {
        int bin = 0, power = 0, rem;
        while (num > 0) {
            rem = num % 2;
            bin = bin + (rem * (int) Math.pow(10, power));
            power++;
            num = num / 2;
        }
        return bin;
    }

    public static void main(String[] args) {
        System.out.println("The Binary equivalent of 25 is " + dectobin(25));
    }
}
