import java.util.Scanner;

public class SwiggyFoodOrder{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String food;
        int quantity;
        int total = 0;

        System.out.println("===== SWIGGY FOOD MENU =====");
        System.out.println("Pizza  - ₹150");
        System.out.println("Burger - ₹80");
        System.out.println("Dosa   - ₹60");
        System.out.println("Coffee - ₹30");

        System.out.print("\nEnter food item: ");
        food = sc.nextLine();

        System.out.print("Enter quantity: ");
        quantity = sc.nextInt();

        // Conditional Statements
        if(food.equalsIgnoreCase("Pizza")) {

            total = 150 * quantity;
            System.out.println("\nPizza Available");
            System.out.println("Order Confirmed");

        }
        else if(food.equalsIgnoreCase("Burger")) {

            total = 80 * quantity;
            System.out.println("\nBurger Available");
            System.out.println("Order Confirmed");

        }
        else if(food.equalsIgnoreCase("Dosa")) {

            total = 60 * quantity;
            System.out.println("\nDosa Available");
            System.out.println("Order Confirmed");

        }
        else if(food.equalsIgnoreCase("Coffee")) {

            total = 30 * quantity;
            System.out.println("\nCoffee Available");
            System.out.println("Order Confirmed");

        }
        else {

            System.out.println("\nFood Item Not Found");
        }

        // Final Bill
        if(total > 0) {

            System.out.println("Quantity : " + quantity);
            System.out.println("Total Bill :" +"₹"+total);
			System.out.println("Thanks for Ordering.");
        }

    }
}