import java.util.Scanner;

public class EvenOddArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] num = new int[10];

        System.out.println("Enter 10 numbers:");

        for (int i = 0; i < 10; i++) {
            num[i] = sc.nextInt();
        }

        System.out.println("Even Numbers:");
        for (int i = 0; i < 10; i++) {
            if (num[i] % 2 == 0)
                System.out.println(num[i]);
        }

        System.out.println("Odd Numbers:");
        for (int i = 0; i < 10; i++) {
            if (num[i] % 2 != 0)
                System.out.println(num[i]);
        }

        sc.close();
    }
}
