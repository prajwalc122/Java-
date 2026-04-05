import java.io.*;
import java.util.Scanner;

class Student {
    int enrollmentNo;
    String name;
    int mark1, mark2, mark3;
    int totalMarks;

    // Constructor
    Student(int enrollmentNo, String name, int mark1, int mark2, int mark3) {
        this.enrollmentNo = enrollmentNo;
        this.name = name;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;

        totalMarks = mark1 + mark2 + mark3;
    }

    // Display function
    void display() {
        System.out.println("Enrollment No: " + enrollmentNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + mark1 + ", " + mark2 + ", " + mark3);
        System.out.println("Total: " + totalMarks);

        if (mark1 >= 50 && mark2 >= 50 && mark3 >= 50) {
            System.out.println(name + " has PASSED");
        } else {
            System.out.println(name + " has FAILED");
        }

        System.out.println("-------------------");
    }
}

public class StudentTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Student[] s = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details of student " + (i + 1));

            System.out.print("Enrollment No: ");
            int eno = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Mark1: ");
            int m1 = sc.nextInt();

            System.out.print("Mark2: ");
            int m2 = sc.nextInt();

            System.out.print("Mark3: ");
            int m3 = sc.nextInt();

            s[i] = new Student(eno, name, m1, m2, m3);
        }

        System.out.println("\nStudent Details:");
        for (int i = 0; i < n; i++) {
            s[i].display();
        }

        sc.close();
    }
}