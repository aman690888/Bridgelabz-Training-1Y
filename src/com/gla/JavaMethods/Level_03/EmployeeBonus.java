public class EmployeeBonus {

    public static double[][] generateData() {
        double[][] data = new double[10][2]; // salary & years
        for (int i = 0; i < 10; i++) {
            data[i][0] = (int)(Math.random()*90000)+10000; // 5 digit salary
            data[i][1] = (int)(Math.random()*10)+1; // years
        }
        return data;
    }

    public static double[][] calculateBonus(double[][] data) {
        double[][] result = new double[10][3];
        for (int i = 0; i < 10; i++) {
            double salary = data[i][0];
            double years = data[i][1];

            double bonus = (years > 5) ? salary*0.05 : salary*0.02;
            double newSalary = salary + bonus;

            result[i][0]=salary;
            result[i][1]=bonus;
            result[i][2]=newSalary;
        }
        return result;
    }

    public static void main(String[] args) {

        double[][] data = generateData();
        double[][] result = calculateBonus(data);

        double totalOld=0,totalNew=0,totalBonus=0;

        System.out.println("OldSalary\tBonus\tNewSalary");

        for(int i=0;i<10;i++){
            System.out.println(result[i][0]+"\t"+result[i][1]+"\t"+result[i][2]);
            totalOld+=result[i][0];
            totalBonus+=result[i][1];
            totalNew+=result[i][2];
        }

        System.out.println("\nTotal Old Salary: "+totalOld);
        System.out.println("Total Bonus: "+totalBonus);
        System.out.println("Total New Salary: "+totalNew);
    }
}
