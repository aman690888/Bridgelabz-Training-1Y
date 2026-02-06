import java.util.Scanner;

public class ReverseNumberArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int[] arr = new int[20];
        int i = 0;

        while (num != 0) {
            arr[i++] = num % 10;
            num /= 10;
        }

        System.out.print("Reverse = ");

        for (int j = 0; j < i; j++) {
            System.out.print(arr[j]);
        }

        sc.close();
    }
}
