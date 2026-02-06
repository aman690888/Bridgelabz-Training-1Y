import java.util.Scanner;

public class DynamicArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        int[] newArr = new int[10];

        for (int i = 0; i < 5; i++) {
            newArr[i] = arr[i];
        }

        System.out.println("Enter 5 more numbers:");

        for (int i = 5; i < 10; i++) {
            newArr[i] = sc.nextInt();
        }

        System.out.println("Final Array:");

        for (int i = 0; i < 10; i++) {
            System.out.print(newArr[i] + " ");
        }

        sc.close();
    }
}
