import java.util.Scanner;

public class BMI1DArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] weight = new double[5];
        double[] height = new double[5];

        System.out.println("Enter weight and height:");

        for (int i = 0; i < 5; i++) {
            weight[i] = sc.nextDouble();
            height[i] = sc.nextDouble();
        }

        for (int i = 0; i < 5; i++) {
            double h = height[i] / 100;
            double bmi = weight[i] / (h * h);

            System.out.println("BMI = " + bmi);
        }

        sc.close();
    }
}
