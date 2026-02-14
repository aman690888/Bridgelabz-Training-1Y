import java.util.Scanner;

public class MaximumHandshakes {

    public int calculateHandshakes(int numberOfStudents) {
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numberOfStudents = scanner.nextInt();

        MaximumHandshakes handshakes = new MaximumHandshakes();
        int result = handshakes.calculateHandshakes(numberOfStudents);

        System.out.println("Maximum number of handshakes: " + result);
    }
}
