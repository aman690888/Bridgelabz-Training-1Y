import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];

        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < 5; i++) {
            num[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {

            if (num[i] > 0)
                System.out.print("Positive ");
            else if (num[i] < 0)
                System.out.print("Negative ");
            else
                System.out.print("Zero ");

            if (num[i] % 2 == 0)
                System.out.println("Even");
            else
                System.out.println("Odd");
        }

        sc.close();
    }
}
