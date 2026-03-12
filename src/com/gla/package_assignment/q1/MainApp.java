package com.gla.package_assignment.q1;

import com.gla.package_assignment.q1.student.Student;
import com.gla.package_assignment.q1.faculty.Faculty;

public class MainApp {

    public static void main(String[] args) {

        Student s = new Student();
        s.displayStudent("Aman", 101);

        Faculty f = new Faculty();
        f.displayFaculty("Dr. Sharma", "Java");
    }
}