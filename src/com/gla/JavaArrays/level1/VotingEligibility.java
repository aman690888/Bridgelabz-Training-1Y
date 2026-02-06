import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] age = new int[10];

        System.out.println("Enter age of 10 students:");

        for (int i = 0; i < 10; i++) {
            age[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {

            if (age[i] < 0)
                System.out.println("Invalid Age");
            else if (age[i] >= 18)
                System.out.println("Can Vote");
            else
                System.out.println("Cannot Vote");
        }

        sc.close();
    }
}
