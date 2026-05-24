import java.util.Scanner;

public class StrikeRate{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int runs, balls;
        double strikeRate;

        System.out.print("Enter runs scored: ");
        runs = sc.nextInt();

        System.out.print("Enter balls faced: ");
        balls = sc.nextInt();

        strikeRate = (runs * 100.0) / balls;

        System.out.println("Strike Rate = " + strikeRate);
    }
}