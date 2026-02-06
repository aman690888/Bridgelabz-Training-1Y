import java.util.Scanner;

public class BMI2DArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[][] data = new double[5][2];

        System.out.println("Enter weight and height:");

        for (int i = 0; i < 5; i++) {
            data[i][0] = sc.nextDouble();
            data[i][1] = sc.nextDouble();
        }

        for (int i = 0; i < 5; i++) {

            double h = data[i][1] / 100;
            double bmi = data[i][0] / (h * h);

            System.out.println("BMI = " + bmi);
        }

        sc.close();
    }
}
