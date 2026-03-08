import java.util.Scanner;

public class user
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        float number;

        System.out.println("Enter a number:");
        number = sc.nextFloat();

        System.out.println("You entered: " + number);
    }
}