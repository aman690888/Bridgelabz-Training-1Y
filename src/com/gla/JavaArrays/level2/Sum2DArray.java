import java.util.Scanner;

public class Sum2DArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[2][2];
        int sum = 0;

        System.out.println("Enter 2x2 matrix:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = sc.nextInt();
                sum += arr[i][j];
            }
        }

        System.out.println("Sum = " + sum);
        sc.close();
    }
}
