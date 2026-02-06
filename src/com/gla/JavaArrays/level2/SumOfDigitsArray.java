import java.util.Scanner;

public class SumOfDigitsArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int[] digits = new int[20];
        int i = 0, sum = 0;

        while (num != 0) {
            digits[i] = num % 10;
            sum += digits[i];
            num /= 10;
            i++;
        }

        System.out.println("Sum of digits = " + sum);
        sc.close();
    }
}
