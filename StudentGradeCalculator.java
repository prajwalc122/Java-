import java.util.Scanner;

public class StudentGradeCalculator{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name;
        int m1, m2, m3, m4, m5;
        int total;
        double percentage;

        System.out.println("Enter Student Name:");
        name = sc.nextLine();

        System.out.println("Enter Marks of 5 Subjects:");

        System.out.print("Subject 1: ");
        m1 = sc.nextInt();

        System.out.print("Subject 2: ");
        m2 = sc.nextInt();

        System.out.print("Subject 3: ");
        m3 = sc.nextInt();

        System.out.print("Subject 4: ");
        m4 = sc.nextInt();

        System.out.print("Subject 5: ");
        m5 = sc.nextInt();

        total = m1 + m2 + m3 + m4 + m5;

        percentage = total / 5.0;

        System.out.println("\n----- RESULT -----");

        System.out.println("Student Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage);

        if (percentage >= 90) {
            System.out.println("Grade: A+");
        }
        else if (percentage >= 75) {
            System.out.println("Grade: A");
        }
        else if (percentage >= 60) {
            System.out.println("Grade: B");
        }
        else if (percentage >= 35) {
            System.out.println("Grade: C");
        }
        else {
            System.out.println("Grade: FAIL");
        }

        sc.close();
    }
}