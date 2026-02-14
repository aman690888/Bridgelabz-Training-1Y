import java.util.Scanner;

public class AthleteRun {

    public double calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        return 5000 / perimeter;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter side 1: ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter side 2: ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter side 3: ");
        double side3 = scanner.nextDouble();

        AthleteRun run = new AthleteRun();
        double rounds = run.calculateRounds(side1, side2, side3);

        System.out.println("Athlete needs to complete " + rounds + " rounds.");
    }
}
