import java.util.Scanner;
import java.io.*;

public class number{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b, c;

        // Input values
        System.out.print("Enter three numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        // Check which is largest
        if (a >= b && a >= c) {
            System.out.println("Largest = " + a);
        } 
        else if (b >= a && b >= c) {
            System.out.println("Largest = " + b);
        } 
        else {
            System.out.println("Largest = " + c);
        }

        sc.close();
    }
}