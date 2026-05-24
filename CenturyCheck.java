import java.util.Scanner;

public class CenturyCheck{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int runs;

        System.out.print("Enter Virat kohli runs: ");
        runs = sc.nextInt();

        if(runs >= 100)
            System.out.println("Century!");
        else if(runs >= 50)
            System.out.println("Half Century!");
        else
            System.out.println("Special Knok at Crucial time.");
    }
}