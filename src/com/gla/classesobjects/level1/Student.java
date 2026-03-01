public class Student {

    String name;
    int rollNo;
    double marks;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.name = "Aman";
        s1.rollNo = 101;
        s1.marks = 85.5;

        s1.display();
    }
}