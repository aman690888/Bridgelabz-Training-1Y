import java.util.Scanner;

public class LargestSecondLargest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int largest = 0, second = 0;

        while (n != 0) {
            int d = n % 10;

            if (d > largest) {
                second = largest;
                largest = d;
            } else if (d > second && d != largest) {
                second = d;
            }

            n /= 10;
        }

        System.out.println("Largest = " + largest);
        System.out.println("Second Largest = " + second);

        sc.close();
    }
}
