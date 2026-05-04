import java.io.*;
import java.util.Scanner;

public class Calculator{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

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

        sc.close();
    }
}