import java.util.Scanner;

public class input
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int number;

        System.out.println("Enter a number:");
        number = sc.nextInt();

        System.out.println("You entered: " + number);
    }
}