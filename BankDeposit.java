import java.util.Scanner;

public class BankDeposit{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Initial Balance
        double balance = 33000;

        double depositAmount;

        System.out.println("===== BANK SYSTEM =====");

        System.out.println("Current Balance = ₹" + balance);

        // User Input
        System.out.print("Enter Deposit Amount: ₹");
        depositAmount = sc.nextDouble();

        // Calculate New Balance
        balance = balance + depositAmount;

        // Display Final Balance
        System.out.println("\nAmount Deposited Successfully");

        System.out.println("Updated Balance = ₹" + balance);
    }
}