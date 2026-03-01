public class StudentReport {

    String name;
    int rollNumber;
    double marks;

    String calculateGrade() {
        if (marks >= 90) return "A";
        else if (marks >= 75) return "B";
        else if (marks >= 50) return "C";
        else return "Fail";
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }

    public static void main(String[] args) {

        StudentReport s = new StudentReport();

        s.name = "Aman";
        s.rollNumber = 101;
        s.marks = 82;

        s.displayDetails();
    }
}