import java.util.Scanner;

public class TwoDToOneD {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[2][2];
        int[] oneD = new int[4];
        int k = 0;

        System.out.println("Enter 2x2 Matrix:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = sc.nextInt();
                oneD[k++] = arr[i][j];
            }
        }

        System.out.println("1D Array:");

        for (int i = 0; i < 4; i++) {
            System.out.println(oneD[i]);
        }

        sc.close();
    }
}
