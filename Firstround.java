import java.util.Scanner;

public class Firstround{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String studentName;
        String collegeName;
        int rank;

        System.out.print("Enter Student Name: ");
        studentName = sc.nextLine();

        System.out.print("Enter College Name: ");
        collegeName = sc.nextLine();

        System.out.print("Enter Your Kcet Rank: ");
        rank = sc.nextInt();

        System.out.println("\n----- Admission Details -----");
        System.out.println("Student Name : " + studentName);
        System.out.println("College Name : " + collegeName);
        System.out.println("Kcet Rank Will Be  : " + rank);

        // Eligibility Check
        if (rank <= 1000) {
            System.out.println("Secure for Mechanical and civil course In First Round.");
        }
        else if (rank <= 5000) {
            System.out.println("Secure for Information Science In First Round.");
        }
        else if (rank <= 10000) {
            System.out.println("Secure for Electronics In First Round.");
        }
        else {
            System.out.println("Secure for Computer Science In First Round.");
        }

        sc.close();
    }
}