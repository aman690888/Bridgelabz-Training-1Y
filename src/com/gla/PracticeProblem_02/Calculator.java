import java.util.Scanner;

public class Calculator {

    static double add(double a, double b) {
        return a + b;
    }

    static double sub(double a, double b) {
        return a - b;
    }

    static double mul(double a, double b) {
        return a * b;
    }

    static double div(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");

        System.out.print("Choose: ");
        int ch = sc.nextInt();

        switch (ch) {

            case 1:
                System.out.println("Result = " + add(a, b));
                break;

            case 2:
                System.out.println("Result = " + sub(a, b));
                break;

            case 3:
                System.out.println("Result = " + mul(a, b));
                break;

            case 4:
                System.out.println("Result = " + div(a, b));
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}
