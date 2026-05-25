import java.util.Scanner;

public class CollegeAdmission{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String studentName;
        String collegeName;
        int rank;

        System.out.print("Enter Student Name: ");
        studentName = sc.nextLine();

        System.out.print("Enter College Name: ");
        collegeName = sc.nextLine();

        System.out.print("Enter Your Rank: ");
        rank = sc.nextInt();

        System.out.println("\n----- Admission Details -----");
        System.out.println("Student Name : " + studentName);
        System.out.println("College Name : " + collegeName);
        System.out.println("Rank         : " + rank);

        // Eligibility Check
        if (rank <= 1000) {
            System.out.println("Eligible for Computer Science");
        }
        else if (rank <= 5000) {
            System.out.println("Eligible for Information Science");
        }
        else if (rank <= 10000) {
            System.out.println("Eligible for Electronics");
        }
        else {
            System.out.println("Eligible for General Courses");
        }

        sc.close();
    }
}