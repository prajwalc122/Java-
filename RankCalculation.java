import java.util.Scanner;

public class RankCalculation{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int rank;
        int totalStudents;

        // User Input
        System.out.print("Enter Your Rank: ");
        rank = sc.nextInt();

        System.out.print("Enter Total Students: ");
        totalStudents = sc.nextInt();

        // Calculate Percentage Rank
        double percentage = ((double) rank / totalStudents) * 100;

        // Better Than Students
        double betterThan = 100 - percentage;

        // Output
        System.out.println("\n===== RESULT =====");

        System.out.println("Your Rank: " + rank);

        System.out.println("Top Percentage: " + percentage + "%");

        System.out.println("You performed better than " + betterThan + "% students");

    }
}