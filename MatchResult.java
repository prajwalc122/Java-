import java.util.Scanner;

public class MatchResult{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int RCB, CSK;

        System.out.print("Enter RCB score: ");
        RCB= sc.nextInt();

        System.out.print("Enter CSK score: ");
        CSK= sc.nextInt();

        if(RCB >CSK)
            System.out.println("RCB Wins");
        else if(CSK > RCB)
            System.out.println("CSK Wins");
        else
            System.out.println("Match Draw");
    }
}