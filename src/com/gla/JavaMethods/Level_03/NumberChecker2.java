import java.util.Scanner;

public class NumberChecker2 {

    public static int[] getDigits(int number) {
        String numStr = String.valueOf(number);
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++)
            digits[i] = numStr.charAt(i) - '0';
        return digits;
    }

    public static int sumDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += d;
        return sum;
    }

    public static int sumSquares(int[] digits) {
        int sum = 0;
        for (int d : digits)
            sum += Math.pow(d, 2);
        return sum;
    }

    public static boolean isHarshad(int number, int sumDigits) {
        return number % sumDigits == 0;
    }

    public static void digitFrequency(int[] digits) {
        int[][] freq = new int[10][2];

        for (int i = 0; i < 10; i++)
            freq[i][0] = i;

        for (int d : digits)
            freq[d][1]++;

        System.out.println("Digit Frequency:");
        for (int i = 0; i < 10; i++)
            if (freq[i][1] > 0)
                System.out.println(freq[i][0] + " -> " + freq[i][1]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();

        int[] digits = getDigits(number);

        int sum = sumDigits(digits);

        System.out.println("Sum of Digits: " + sum);
        System.out.println("Sum of Squares: " + sumSquares(digits));
        System.out.println("Harshad Number: " + isHarshad(number, sum));

        digitFrequency(digits);
    }
}
