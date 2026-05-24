import java.util.Scanner;

public class IPLPoints{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int wins, losses, points;

        System.out.print("Enter matches won: ");
        wins = sc.nextInt();

        System.out.print("Enter matches lost: ");
        losses = sc.nextInt();

        points = wins * 2;

        System.out.println("Total Points = " + points);

        if(points >= 16)
            System.out.println("Qualified for Playoffs");
        else
            System.out.println("Not Qualified");
    }
}