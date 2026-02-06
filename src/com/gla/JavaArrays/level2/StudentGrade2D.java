import java.util.Scanner;

public class StudentGrade2D {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] marks = new int[5][3];

        System.out.println("Enter marks of 3 subjects:");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                marks[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 5; i++) {

            int total = 0;

            for (int j = 0; j < 3; j++) {
                total += marks[i][j];
            }

            double avg = total / 3.0;

            if (avg >= 80)
                System.out.println("Grade A");
            else if (avg >= 60)
                System.out.println("Grade B");
            else if (avg >= 40)
                System.out.println("Grade C");
            else
                System.out.println("Fail");
        }

        sc.close();
    }
}
