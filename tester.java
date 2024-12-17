package JavaCodesForExam;

public class tester {
    public static void main(String[] args) {
        double fahrenheit = 50.0;
        double celsius = convertFahrenheitToCelsius(fahrenheit);
        System.out.println("The result is " + celsius);
    }

    private static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

}
