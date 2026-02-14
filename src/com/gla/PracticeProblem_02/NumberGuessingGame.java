import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    static int generateGuess(int low, int high) {
        return (low + high) / 2;
    }

    static String getFeedback(Scanner sc) {
        System.out.print("Is it High, Low or Correct? ");
        return sc.next().toLowerCase();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int low = 1, high = 100;
        String feedback;

        System.out.println("Think of a number between 1 and 100");

        do {
            int guess = generateGuess(low, high);
            System.out.println("Computer guesses: " + guess);

            feedback = getFeedback(sc);

            if (feedback.equals("low"))
                low = guess + 1;

            else if (feedback.equals("high"))
                high = guess - 1;

        } while (!feedback.equals("correct"));

        System.out.println("Guessed correctly!");
        sc.close();
    }
}
