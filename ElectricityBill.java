import java.util.Scanner;

public class ElectricityBill{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String customerName;
        int units;
        double billAmount = 0;
        double tax;
        double finalBill;

        System.out.print("Enter Customer Name: ");
        customerName = sc.nextLine();

        System.out.print("Enter Units Consumed: ");
        units = sc.nextInt();

        // Bill Calculation
        if (units <= 100) {
            billAmount = units * 2;
        }
        else if (units <= 200) {
            billAmount = (100 * 2) + ((units - 100) * 3);
        }
       
        else {
            billAmount = (100 * 2) + (100 * 3) + (100 * 5) + ((units - 300) * 7);
        }

        // Tax Calculation (5%)
        tax = billAmount * 0.05;

        // Final Bill
        finalBill = billAmount + tax;

        // Output
        System.out.println("\n------ Electricity Bill ------");
        System.out.println("Customer Name : " + customerName);
        System.out.println("Units Consumed: " + units);
        System.out.println("Bill Amount   : Rs." + billAmount);
        System.out.println("Tax (5%)      : Rs." + tax);
        System.out.println("Final Bill    : Rs." + finalBill);

        sc.close();
    }
}