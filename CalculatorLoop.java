import java.io.*;
import java.util.Scanner;

public class CalculatorLoop{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char choice;

        do {
            System.out.println("Enter first number:");
            double num1 = sc.nextDouble();

            System.out.println("Enter second number:");
            double num2 = sc.nextDouble();

            System.out.println("Choose operation: +  -  *  /");
            char op = sc.next().charAt(0);

            double result;

            if (op == '+') {
                result = num1 + num2;
                System.out.println("Result: " + result);
            } 
            else if (op == '-') {
                result = num1 - num2;
                System.out.println("Result: " + result);
            } 
            else if (op == '*') {
                result = num1 * num2;
                System.out.println("Result: " + result);
            } 
            else if (op == '/') {
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Cannot divide by zero");
                }
            } 
            else {
                System.out.println("Invalid operation");
            }

            System.out.println("Do you want to continue? (y/n)");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Calculator closed.");
        sc.close();
    }
}