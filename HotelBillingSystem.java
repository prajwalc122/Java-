import java.io.*;
import java.util.Scanner;

public class HotelBillingSystem{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice, quantity;
        double total = 0;

        do {
            System.out.println("\n===== HOTEL MENU =====");
            System.out.println("1. Idli       - ₹30");
            System.out.println("2. Dosa       - ₹50");
            System.out.println("3. Poori      - ₹40");
            System.out.println("4. Coffee     - ₹20");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice) {

                case 1:
                    System.out.print("Enter quantity: ");
                    quantity = sc.nextInt();
                    total = total + (30 * quantity);
                    break;

                case 2:
                    System.out.print("Enter quantity: ");
                    quantity = sc.nextInt();
                    total = total + (50 * quantity);
                    break;

                case 3:
                    System.out.print("Enter quantity: ");
                    quantity = sc.nextInt();
                    total = total + (40 * quantity);
                    break;

                case 4:
                    System.out.print("Enter quantity: ");
                    quantity = sc.nextInt();
                    total = total + (20 * quantity);
                    break;

                case 5:
                    System.out.println("\nThank You Visit Again!");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while(choice != 5);

        System.out.println("\n===== FINAL BILL =====");
        System.out.println("Total Amount = ₹" + total);
    }
}