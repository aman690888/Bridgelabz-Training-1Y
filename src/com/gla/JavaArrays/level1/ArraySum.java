import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] num = new int[5];
        int sum = 0;

        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < 5; i++) {
            num[i] = sc.nextInt();
            sum += num[i];
        }

        System.out.println("Sum = " + sum);

        sc.close();
    }
}
