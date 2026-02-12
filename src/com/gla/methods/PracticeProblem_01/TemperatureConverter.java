import java.util.Scanner;

public class TemperatureConverter {

    static double toCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    static double toFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.print("Choose: ");

        int ch = sc.nextInt();

        if (ch == 1) {

            System.out.print("Enter Fahrenheit: ");
            double f = sc.nextDouble();

            System.out.println("Celsius = " + toCelsius(f));
        }

        else if (ch == 2) {

            System.out.print("Enter Celsius: ");
            double c = sc.nextDouble();

            System.out.println("Fahrenheit = " + toFahrenheit(c));
        }

        sc.close();
    }
}
