import java.util.Scanner;

public class EconomyRate{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int runsGiven;
        double overs, economy;

        System.out.print("Enter runs given: ");
        runsGiven = sc.nextInt();

        System.out.print("Enter overs bowled: ");
        overs = sc.nextDouble();

        economy = runsGiven / overs;

        System.out.println("Economy Rate = " + economy);
    }
}