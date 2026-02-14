import java.util.Scanner;

public class SumOfNaturalNumbers {

    public int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        SumOfNaturalNumbers sumObj = new SumOfNaturalNumbers();
        int result = sumObj.calculateSum(n);

        System.out.println("Sum of first " + n + " natural numbers is: " + result);
    }
}
