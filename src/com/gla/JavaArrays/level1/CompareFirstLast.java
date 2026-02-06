import java.util.Scanner;

public class CompareFirstLast {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] num = new int[5];

        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < 5; i++) {
            num[i] = sc.nextInt();
        }

        if (num[0] == num[4])
            System.out.println("First and Last are Equal");
        else
            System.out.println("First and Last are Not Equal");

        sc.close();
    }
}
