import java.util.Scanner;

public class StudentGrade1D {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] marks = new int[5];

        System.out.println("Enter marks:");

        for (int i = 0; i < 5; i++) {
            marks[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {

            if (marks[i] >= 80)
                System.out.println("Grade A");
            else if (marks[i] >= 60)
                System.out.println("Grade B");
            else if (marks[i] >= 40)
                System.out.println("Grade C");
            else
                System.out.println("Fail");
        }

        sc.close();
    }
}
