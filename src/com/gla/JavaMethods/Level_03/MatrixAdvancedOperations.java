public class MatrixAdvancedOperations {

    public static double[][] createMatrix(int n) {
        double[][] matrix = new double[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = (int)(Math.random()*5)+1;
        return matrix;
    }

    public static double[][] transpose(double[][] m) {
        int n = m.length;
        double[][] t = new double[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                t[j][i] = m[i][j];
        return t;
    }

    public static double determinant2x2(double[][] m) {
        return m[0][0]*m[1][1] - m[0][1]*m[1][0];
    }

    public static double determinant3x3(double[][] m) {
        return m[0][0]*(m[1][1]*m[2][2]-m[1][2]*m[2][1])
                - m[0][1]*(m[1][0]*m[2][2]-m[1][2]*m[2][0])
                + m[0][2]*(m[1][0]*m[2][1]-m[1][1]*m[2][0]);
    }

    public static double[][] inverse2x2(double[][] m) {
        double det = determinant2x2(m);
        double[][] inv = {
                { m[1][1]/det, -m[0][1]/det },
                { -m[1][0]/det, m[0][0]/det }
        };
        return inv;
    }

    public static void display(double[][] m) {
        for (double[] row : m) {
            for (double val : row)
                System.out.print(val + " ");
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {

        double[][] matrix = createMatrix(2);

        System.out.println("Matrix:");
        display(matrix);

        System.out.println("Transpose:");
        display(transpose(matrix));

        System.out.println("Determinant: " + determinant2x2(matrix));

        System.out.println("Inverse:");
        display(inverse2x2(matrix));
    }
}
