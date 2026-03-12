package com.gla.package_assignment.q10.college.main;

import com.gla.package_assignment.q10.college.student.Student;
import com.gla.package_assignment.q10.college.faculty.Faculty;
import com.gla.package_assignment.q10.college.department.Department;

public class MainApp {

    public static void main(String[] args) {

        Student s = new Student("Aman", 101);
        Faculty f = new Faculty("Dr. Sharma", "Java Programming");
        Department d = new Department("Computer Science");

        System.out.println("===== College Management System =====\n");

        s.displayStudent();
        System.out.println();

        f.displayFaculty();
        System.out.println();

        d.displayDepartment();
    }
}